package lv.va.sludinajumuportals.service;

import java.util.ArrayList;
import java.util.List;
import lv.va.sludinajumuportals.domain.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    String name = "Karlis";
    public List<User> UserList;
    
    public UserService() {
        UserList = UserInitialization();
     }
    public User getUser() {
        User user = new User(1L, "Juris", "Akmens", "int");
        return user;
    }
    public List<User> getUserListByUserName(String name, String surname) {
        List<User> filteredByName = new ArrayList<>();
        for (User user : UserList) {
            if(user.getName().matches(name)) {
                filteredByName.add(user);
            }
            if(user.getSurname().matches(surname)){
                filteredByName.add(user);
            }
        }
        return filteredByName;
    }
    
    
    public ArrayList<User> getUserList() {
        ArrayList<User> users = new ArrayList<>();
        User user = new User(1L, "Juris", "Akmens", "int");


        users.add(user);

        return users;
    }

    private List<User> UserInititialization() {
        List<User> users = new ArrayList<>();
        for(int i = 1; i< name.length(); i++){
            User user = new User(Long.valueOf(i), "Pēteris", "Liepins" + i, getUserName(i));
            users.add(user);
        }
        return users;

    }


    private String getUserName(int i) {
        if(i % 2 == 0 ) {
            return "Jānis";
        }
        return "Pēteris";
    }

    private List<User> UserInitialization() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}