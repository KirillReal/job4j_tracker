package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        if(!users.containsValue(user)){
            users.put(user,new ArrayList<>());
        }
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        List<Account> list = users.get(user);
        if(user != null) {
            if(list != null) {
                if (!(list).contains(account)) {
                    list.add(account);
                }
            }
        }
    }

    public User findByPassport(String passport) {
        User find = null;
        for (User user: users.keySet()) {
            if(user.getPassport().equals(passport)){
                find = user;
                break;
            }
        }
        return find;
    }

    public Account findByRequisite(String passport, String requisite) {
        Account findRequisite = null;
        User user = findByPassport(passport);
        List<Account> accounts = users.get(user);
        if(user != null) {
            for (Account accountRequisite : accounts) {
                if (accountRequisite.getRequisite().equals(requisite)) {
                    findRequisite = accountRequisite;
                    break;
                }
            }
        }
        return findRequisite;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = true;
        Account srcAccount = findByRequisite(srcPassport,srcRequisite);
        Account destAccount = findByRequisite(destPassport,destRequisite);
        if (srcAccount.getBalance() < amount || srcAccount.getBalance() == 0) {
            rsl = false;
        } else
            srcAccount.setBalance(srcAccount.getBalance() - amount);
        destAccount.setBalance(destAccount.getBalance() + amount);
        return rsl;
    }

}
