package example2.com;

import java.util.List;

import javax.xml.crypto.Data;

public class UserParser {
    private DataBase dataBaseInstance = DataBase.getInstance();
    private List<User> users = dataBaseInstance.getUsers();

    public List<User> getUsers(){
        return users ; 
    }

    public User getUserInfo(String userName){
        for (User user : users ){
            if ((user.getName()).equals(userName)){
                return user;
            }
        }
        return null;
    }

}
