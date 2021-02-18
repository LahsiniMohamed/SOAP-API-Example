package clientJava.example.com;

import java.util.List;

import com.baeldung.soap.ws.client.generated.User;
import com.baeldung.soap.ws.client.generated.UserServiceService;
import com.baeldung.soap.ws.client.generated.UserService;


public class Client {
    private static List<User> getUserClient(){
        UserServiceService service = new UserServiceService();
        UserService port = service.getUserServicePort();
        return port.getUsersService();
    }

    private static User getUserInfo(String userName){
        UserServiceService service = new UserServiceService();
        UserService port = service.getUserServicePort();
        return port.getUserInfoService(userName);
    }

    public static void main(String[] args) {
        List<User> users = getUserClient();
        String info = "";
        for (User user : users){
            info =info + " name : " + user.getName() + " addresse :" + user.getAddresse() + " phoneNumber : " + user.getPhoneNumber() + "\n";

        }
        System.out.println(info);


        String username = "Lahsini Mohamed";
        System.out.println("Searching for info about user "+ username);

        User user = getUserInfo(username);
        info =" name : " + user.getName() + " addresse :" + user.getAddresse() + " phoneNumber : " + user.getPhoneNumber() + "\n";
        System.out.println(info);

    }
}

