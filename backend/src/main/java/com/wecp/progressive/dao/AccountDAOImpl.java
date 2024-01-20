package com.wecp.progressive.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.wecp.progressive.entity.Accounts;

public class AccountDAOImpl implements AccountDAO {

    static private List<Accounts> accountsList = new ArrayList<Accounts>();

    public AccountDAOImpl() {
        // accountsList = new ArrayList<Accounts>();
    }

    @Override
    public int addAccount(Accounts accounts) {
        accounts.setAccountId(accountsList.size()+1);
        accountsList.add(accounts);
        return accountsList.size();
    }

    @Override
    public Accounts getAccountById(int accountId) {
        for (Accounts accounts : accountsList) {
            if (accounts.getAccountId() == accountId)
                return accounts;
        }
        return null;
    }

    @Override
    public void updateAccount(Accounts accounts) {
        for (Accounts accountsIterator : accountsList) {
            if (accountsIterator.getAccountId() == accounts.getAccountId()) {
                accountsIterator.setBalance(accounts.getBalance());
                accountsIterator.setCustomerId(accounts.getCustomerId());
            }
        }
    }

    @Override
    public void deleteAccount(int accountId) {
        for (Accounts accounts : accountsList) {
            if (accounts.getAccountId() == accountId)
                accountsList.remove(accounts);
        }
    }

    @Override
    public List<Accounts> getAllAccounts() {
        Collections.sort(accountsList);
        return accountsList;
    }

}
