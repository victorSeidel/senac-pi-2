package model;

import java.util.ArrayList;
import java.util.List;

public class UserList 
{
    private static List<User> userList = new ArrayList<>();
    
    public static List<User> getUserList() {
        return userList;
    }

    public static void addUser(User user) {
        userList.add(user);
    }
}
