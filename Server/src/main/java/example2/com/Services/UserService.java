package example2.com.Services;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import example2.com.User;
import example2.com.UserParser;

@WebService
public class UserService {
    private UserParser parser = new UserParser();

    @WebMethod
    public List<User> getUsersService(){
        return parser.getUsers();
    }

    @WebMethod
    public User getUserInfoService(String userName){
        return parser.getUserInfo(userName);
    }
}
