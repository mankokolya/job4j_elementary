package ru.job4j.exception;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (User user : users) {
            if (user.getUserName().equals(login)) {
                return user;
            }
        }
        throw new UserNotFoundException("There is no user with login: " + login);
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (user.isValid() && user.getUserName().length() > 3) {
            return true;
        }
        throw new UserInvalidException("The user " + user.getUserName() + " is not valid");
    }

    public static void main(String[] args) {
        User[] users = {new User("Petr Arsentev", true)};
        try {
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException e) {
            e.printStackTrace();
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }
    }
}
