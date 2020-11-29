package com.weitao.service;

import com.weitao.pojo.Account;

import java.util.List;

public interface IAccountService {
    List<Account> queryAll();

    void saveAccount(Account account);
}
