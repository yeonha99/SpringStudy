package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceimpl;

public class MemberApp {
    public static void main(String[] args) {
        MemberService memberService=new MemberServiceimpl();
        Member member=new Member(1L,"memA", Grade.VIP);
        memberService.join(member);
        Member ret=memberService.findMember(1L);
        System.out.println("find member: "+member.getName());
        System.out.println("ret = " + ret.getName());
    }
}
