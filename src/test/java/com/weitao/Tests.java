package com.weitao;

import com.weitao.pojo.Account;
import com.weitao.service.IAccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class Tests {

    @Autowired
    private IAccountService accountService;

    @Test
    public void test(){
        List<Account> list = accountService.queryAll();
        for (Account account : list) {
            System.out.println(account);
        }
    }
}
