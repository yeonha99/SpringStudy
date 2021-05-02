package hello.core;

import hello.core.Order.OrderService;
import hello.core.Order.OrderServiceimpl;
import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.discount.RateDiscountPolicy;
import hello.core.member.MemberMemberRepository;
import hello.core.member.MemberRepository;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceimpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public MemberService memberService(){
        return new MemberServiceimpl(memberRepository());
    }//생성자 주입
    @Bean
    public MemberRepository memberRepository() {
        return new MemberMemberRepository();
    }
    @Bean
    public OrderService orderService(){
        return new OrderServiceimpl(memberRepository(),discountPolicy());
    }//생성자 주입
    @Bean
    public DiscountPolicy discountPolicy(){
        return new RateDiscountPolicy();
    }
}
