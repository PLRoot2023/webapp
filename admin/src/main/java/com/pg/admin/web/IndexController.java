package com.pg.admin.web;


import com.pg.mybatis.dao.BRoleMapper;
import com.pg.mybatis.dao.BUserMapper;
import com.pg.mybatis.entity.BRole;
import com.pg.mybatis.entity.BUser;
import com.pg.mybatis.entity.BUserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;

@Controller
public class IndexController {


    @Autowired
    private BUserMapper loginUserMapper;

    @Autowired
    private BRoleMapper roleMapper;


    @GetMapping("index")
    public String index(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {

        List<BUser> loginUsers = loginUserMapper.selectByExample(new BUserExample());

        LocalDateTime now = LocalDateTime.now();

        System.out.println(loginUsers);
        BRole row1 = new BRole();
        row1.setName("role");
        row1.setCreateTime(now);
        row1.setUpdateTime(now);
        roleMapper.insertSelective(row1);

        BUser row = new BUser();
        Random r= new Random();
        row.setName("user"+ r.nextInt());
        row.setRoleId(row1.getId());
        row.setPassword("password"+row);
        row.setCreateTime(now);
        row.setUpdateTime(now);
        loginUserMapper.insertSelective(row);
        model.addAttribute("users", loginUsers);
        return "main";
    }


}
