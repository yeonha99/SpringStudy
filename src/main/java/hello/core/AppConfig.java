package hello.core;

import hello.core.Order.OrderService;
import hello.core.Order.OrderServiceimpl;
import hello.core.discount.FixDiscountPolicy;
import hello.core.member.MemberMemberRepository;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceimpl;

public class AppConfig {
    public MemberService memberService(){
        return new MemberServiceimpl(new MemberMemberRepository());
    }//생성자 주입

    public OrderService orderService(){
        return new OrderServiceimpl(new MemberMemberRepository(),new FixDiscountPolicy());
    }//생성자 주입
}
