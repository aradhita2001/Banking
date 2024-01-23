package com.wecp.progressive.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.wecp.progressive.entity.Transactions;

public class TransactionDAOImpl implements TransactionDAO {

    private List<Transactions> transactionsList;

    public TransactionDAOImpl() {
        transactionsList = new ArrayList<Transactions>();
    }

    @Override
    public int addTransaction(Transactions transaction) {
        transaction.setTrasactionId(transactionsList.size()+1);
        transactionsList.add(transaction);
        return transactionsList.size();
    }

    @Override
    public Transactions getTransactionById(int transactionId) {
        for (Transactions transaction : transactionsList) {
            if (transaction.getTrasactionId() == transactionId) return transaction;
        }

        return null;
    }

    @Override
    public void updateTransaction(Transactions transaction) {
        for (Transactions transactionIterator : transactionsList) {
            if (transaction.getAccountId() == transactionIterator.getAccountId()) {
                transactionIterator.setAccountId(transaction.getAccountId());
                transactionIterator.setAmount(transaction.getAmount());
                transactionIterator.setTransactionDate(transaction.getTransactionDate());
                transactionIterator.setTransactionType(transaction.getTransactionType());
            }
        }
    }

    @Override
    public void deleteTransaction(int transactionId) {
        for (Transactions transaction : transactionsList) {
            if (transaction.getTrasactionId() == transactionId) transactionsList.remove(transaction);
        }
    }

    @Override
    public List<Transactions> getAllTransactions() {
        Collections.sort(transactionsList);
        return transactionsList;
    }



}
