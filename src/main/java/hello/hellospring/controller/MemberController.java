package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    //생성자 주입
    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    //필드주입 (스프링이 권장하지 않음, 변경할수가 없음)
    /*
    @Autowired
    private MemberService memberService;
    */

    //Setter 주입(누군가가 호출했을 때 public이 열려 있어야 한다. 노출이 된다. 잘못바꾸면 문제가 생김)
    /*
    private MemberService memberService;

    @Autowired
    public void setMemberService(MemberService memberService) {
        this.memberService = memberService;
    }
    */
}
