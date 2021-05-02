package hello.core.Member;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceimpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {
    MemberService memberService=new MemberServiceimpl();
    @Test
    void join(){
        Member member=new Member(1L,"memberA", Grade.VIP);
        memberService.join(member);
        Member findMember=memberService.findMember(1L);

        Assertions.assertThat(member).isEqualTo(findMember);
    }
}
