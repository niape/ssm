package com.weitao.dao;

import com.weitao.pojo.Account;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("accountDao")
public interface IAccountDao {

    List<Account> queryAll();

    void insertAccount(Account account);

}
