package example2.com;

import javax.xml.ws.Endpoint;

import example2.com.Services.UserService;

public class Main {

    public static void main(String[] args) {
        String url = "http://localhost:8000/service/soap";
        Endpoint.publish(url, new UserService());
    }
    
}
