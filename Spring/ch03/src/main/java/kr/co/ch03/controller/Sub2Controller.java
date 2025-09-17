package kr.co.ch03.controller;

import kr.co.ch03.dto.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Sub2Controller {
    @GetMapping("/sub2/register")
    public String register(){
        return "/sub2/register";
    }
    @PostMapping("/sub2/register")
    public String register(UserDTO userDTO){ // DispatcherServlet에서 자동으로 getParameter 해줌.
        System.out.println(userDTO.toString());

        return "redirect:/index";
    }
}
