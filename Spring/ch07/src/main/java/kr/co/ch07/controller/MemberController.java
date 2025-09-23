package kr.co.ch07.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {
    @GetMapping({"/member/","/member/index"})
    public String index() {
        return "member/index";
    }
}
