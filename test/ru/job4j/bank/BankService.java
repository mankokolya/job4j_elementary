package ru.job4j.bank;

import java.util.*;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        if (!this.users.containsKey(user)) {
            this.users.put(user, new ArrayList<>());
        }
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
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean result = false;
        return result;
    }
}
