package com.weitao.controller;

import com.weitao.pojo.Account;
import com.weitao.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class AccountController {

    @Autowired
    private IAccountService accountService;

    @RequestMapping("/list")
    public String list(Model model){
        List<Account> list = accountService.queryAll();
        model.addAttribute("list",list);
        return "list";
    }
}
