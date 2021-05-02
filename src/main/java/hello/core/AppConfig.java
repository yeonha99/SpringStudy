package hello.core;

import hello.core.Order.OrderService;
import hello.core.Order.OrderServiceimpl;
import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.member.MemberMemberRepository;
import hello.core.member.MemberRepository;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceimpl;

public class AppConfig {
    public MemberService memberService(){
        return new MemberServiceimpl(memberRepository());
    }//생성자 주입

    private MemberRepository memberRepository() {
        return new MemberMemberRepository();
    }

    public OrderService orderService(){
        return new OrderServiceimpl(memberRepository(),discountPolicy());
    }//생성자 주입

    public DiscountPolicy discountPolicy(){
        return new FixDiscountPolicy();
    }
}
