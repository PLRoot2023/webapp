package com.pg.admin.web;

import com.pg.admin.web.vo.LoginVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @PostMapping("login")
    public String login(LoginVO name, Model model){

        model.addAttribute("name",name);
        return "subpage/sub1";
    }

}
