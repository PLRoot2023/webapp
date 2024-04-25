package com.pg.admin.web;

import com.pg.admin.config.dynamic.DataSourceKeyHolder;
import com.pg.admin.config.dynamic.DbConfig;
import com.pg.admin.dao.UserMapper;
import com.pg.admin.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class IndexController {


    @Autowired
    private UserMapper userMapper;

    @GetMapping("index")
    public String index(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {


        List<User> users = userMapper.findAll();

        System.out.println(users);

        DbConfig.setDataSource("2");
        List<User> users2 = userMapper.findAll();

        System.out.println(users2);


        model.addAttribute("users", users);
        return "main";
    }

    @ModelAttribute
    public void addUser(Model model) {
        List<User> users = new ArrayList<>();

    }
}
