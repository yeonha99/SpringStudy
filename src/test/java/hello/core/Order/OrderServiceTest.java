package hello.core.Order;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceimpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {
    OrderService orderService=new OrderServiceimpl(memberRepository, discountPolicy);
    MemberService memberService=new MemberServiceimpl();
    @Test
    void 주문(){
        Member member=new Member(1L,"정연희", Grade.VIP);
        memberService.join(member);
        Order order=orderService.creatOrder(1L,"짜장면",4000);
        System.out.println("order = " + order);
        System.out.println("order.calculatePrice() = " + order.calculatePrice());
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }

}
