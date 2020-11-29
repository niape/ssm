package com.weitao.service.impl;

import com.weitao.dao.IAccountDao;
import com.weitao.pojo.Account;
import com.weitao.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private IAccountDao accountDao;

    @Override
    public List<Account> queryAll() {
        return accountDao.queryAll();
    }

    @Override
    public void saveAccount(Account account) {
        accountDao.insertAccount(account);
    }
}
