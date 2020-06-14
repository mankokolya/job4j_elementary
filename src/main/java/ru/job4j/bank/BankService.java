package ru.job4j.bank;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    public void addAccount(String passport, Account account) {
        Optional<User> user = findByPassport(passport);

        if (user.isPresent()) {
            List<Account> userAccount = this.users.get(user.get());
            if (!userAccount.contains(account)) {
                userAccount.add(account);
                this.users.put(user.get(), userAccount);
            }
        }
    }

    public Optional<User> findByPassport(String passport) {
        return this.users.keySet().stream()
                .filter(user -> user.getPassport().equals(passport))
                .findFirst();
    }

    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> user = findByPassport(passport);
        return user.flatMap(value -> this.users.get(value).stream()
                .filter(account -> account.getRequisite().equals(requisite))
                .findFirst());
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        Optional<Account> sourceAccount = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> destAccount = findByRequisite(destPassport, destRequisite);
        boolean result = false;
        if (sourceAccount.isPresent() && destAccount.isPresent() && sourceAccount.get().getBalance() >= amount) {
            destAccount.get().setBalance(destAccount.get().getBalance() + amount);
            sourceAccount.get().setBalance(sourceAccount.get().getBalance() - amount);
            result = true;
        }
        return result;
    }
}
