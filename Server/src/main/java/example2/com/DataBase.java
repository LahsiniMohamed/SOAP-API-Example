package example2.com;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    private List<User> usersList ; 
    private static DataBase dataBase = new DataBase();
    
    private DataBase(){
        usersList = new ArrayList<>();

        //filling the users in database
        User user1 = new User(1,"Lahsini Mohamed", "addresse1" , "0622458798");
        User user2 = new User(1,"Tchah Oussama", "addresse2", "0215648798");
        User user3 = new User(1,"Said El Boukhari", "addresse3", "0678977878");

        //adding users to the dataBase
        usersList.add(user1);
        usersList.add(user2);
        usersList.add(user3);
        
    }

    public List<User> getUsers(){
        return usersList;
    }
    public static DataBase getInstance(){
        //singleton design pattern
        return dataBase;
    }
    
}
