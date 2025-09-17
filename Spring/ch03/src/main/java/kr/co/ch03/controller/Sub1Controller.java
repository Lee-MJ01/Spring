package kr.co.ch03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller // component에서 파생된 것. 기능 : 스프링 컨테이너에 들어가짐
public class Sub1Controller {
    @RequestMapping(value = "/sub1/hello", method = RequestMethod.GET)
    public String hello(){ return "/sub1/hello"; }

    @GetMapping("/sub1/welcome")
    public String welcome() {
        return "/sub1/welcome";
    }
}
