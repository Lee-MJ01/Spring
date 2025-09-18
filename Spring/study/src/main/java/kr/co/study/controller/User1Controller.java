package kr.co.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class User1Controller {

    @GetMapping("/user1/list")
    public String list(){
        return "/user1/list";
    }
}
