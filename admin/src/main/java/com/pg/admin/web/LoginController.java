package com.pg.admin.web;

import com.pg.admin.entity.Message;
import com.pg.admin.entity.User;
import com.pg.admin.web.vo.LoginVO;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class LoginController {

    @PostMapping("login")
    public String login(LoginVO name, Model model){

        model.addAttribute("name",name);
        return "subpage/sub1";
    }

}
