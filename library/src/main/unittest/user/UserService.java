package main.unittest.user;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class UserService {
    private Map<String, User> users = new HashMap<>();

    private static final Logger LOGGER = Logger.getLogger(UserService.class.getName());

    //CRUD
    //Create-Read-Update-Delete

    //Create
    public void addUser(User user) {
        users.put(user.getEmail(), user);
        LOGGER.info("User created" + user.getEmail());
    }

    //Read
    public User getUserByEmail(String email) {
        User user = users.get(email);
        if (user==null){
            LOGGER.warning("User with email " + email + " not found.");
        }
        return users.get(email);
    }

    //Update
    public boolean updateUser(String email, String newName) {
        User user = users.get(email);
        if (user == null) {
            LOGGER.warning("User with email " + email + " not found.");
            return false;
        }
        user.setName(newName);
        LOGGER.info("User updated " + user.getEmail());
        return true;
    }

    //Delete
    public boolean deleteUser(String email) {
        User user = users.remove(email);
        return user != null;
    }


    public Map<String, User> getUsers() {
        return users;
    }
}
