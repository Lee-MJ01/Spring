package kr.co.study.controller;

import kr.co.study.dto.User1DTO;
import kr.co.study.dto.User2DTO;
import kr.co.study.service.User2Service;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class User2Controller {

    private final User2Service user2Service;

    @GetMapping("/user2/list")
    public String getUsers(Model model) {
        List<User2DTO> dtoList = user2Service.getAllUsers();

        model.addAttribute("dtoList", dtoList);

        return "/user2/list";
    }
}
