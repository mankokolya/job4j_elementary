package ru.job4j.bank;

import java.util.*;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        List<Account> userAccount = this.users.get(user);
        try {
            if (!userAccount.contains(account)) {
                userAccount.add(account);
                this.users.put(user, userAccount);
            }
        } catch (NullPointerException e) {
            System.out.println("User with passport " + passport + " was not found in the system.");
        }
    }

    public User findByPassport(String passport) {
        for (User user : this.users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        try {
            User user = findByPassport(passport);
            List<Account> userAccounts = this.users.get(user);
            for (Account account : userAccounts) {
                if (account.getRequisite().equals(requisite)) {
                    return account;
                }
            }
        } catch (NullPointerException e) {
            System.out.println("User with passport " + passport + " was not found in the system.");
        }
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        Account sourceAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        boolean result = false;
        if (sourceAccount != null && sourceAccount.getBalance() >= amount) {
            destAccount.setBalance(destAccount.getBalance() + amount);
            sourceAccount.setBalance(sourceAccount.getBalance() - amount);
            result = true;
        }
        return result;
    }
}
