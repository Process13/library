package main.tdd.user;

import java.util.HashMap;

public class UserService {
    private HashMap<String, User> users = new HashMap<>();

    public void addUser(User user){
        users.put(user.getEmail(), user);
    }
    public int getUserCount(){
        return users.size();
    }
    public boolean deleteUser(String email){
        User removeUser = users.remove(email);

        if (removeUser == null){
            return false;
        }
        return true;
    }
    public User getUserByEmail(String email){
        return users.get(email);
    }
    public boolean updateUser(String email, String newName){
        User user = users.get(email);
        if (user == null) {
            return false;
        }

        user.setName(newName);
        return true;
    }
}
