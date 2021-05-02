package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceimpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MemberApp {
    public static void main(String[] args) {
      //  AppConfig appConfig=new AppConfig();
       // MemberService memberService=appConfig.memberService();
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(AppConfig.class);
        //스프링컨테이너에 입력 class의 정보를 가지고 구성을 한다.
        MemberService memberService=applicationContext.getBean("memberService",MemberService.class);
        Member member=new Member(1L,"memA", Grade.VIP);
        memberService.join(member);
        Member ret=memberService.findMember(1L);
        System.out.println("find member: "+member.getName());
        System.out.println("ret = " + ret.getName());
    }
}
