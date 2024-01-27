package com.wecp.progressive.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.wecp.progressive.dao.AccountDAO;
import com.wecp.progressive.entity.Accounts;


public class AccountServiceImpl implements AccountService {

    private static List<Accounts> accounts = new ArrayList<Accounts>();
    private AccountDAO accountDAO;

    public AccountServiceImpl(AccountDAO accountDAO){
        this.accountDAO = accountDAO;
    }

    @Override
    public List<Accounts> getAllAccounts() throws SQLException {
        return null;
    }

    @Override
    public List<Accounts> getAccountsByUser(int userId) throws SQLException {
        return null;
    }

    @Override
    public Accounts getAccountById(int accountId) throws SQLException {
        return null;
    }

    @Override
    public int addAccount(Accounts accounts) throws SQLException {
        return 0;
    }

    @Override
    public void updateAccount(Accounts accounts) throws SQLException {
        
    }

    @Override
    public void deleteAccount(int accountId) throws SQLException {
    }

    @Override
    public List<Accounts> getAllAccountsSortedByBalance() throws SQLException {
        return null;
    }

    @Override
    public List<Accounts> getAllAccountsFromArrayList() {
        return accounts;
    }

    @Override
    public List<Accounts> addAccountToArrayList(Accounts accounts) {
        AccountServiceImpl.accounts.add(accounts);
        return AccountServiceImpl.accounts;
    }

    @Override
    public List<Accounts> getAllAccountsSortedByBalanceFromArrayList() {
        Collections.sort(accounts);
        return null;
    }

    @Override
    public void emptyArrayList() {
        accounts.clear();
    }

}