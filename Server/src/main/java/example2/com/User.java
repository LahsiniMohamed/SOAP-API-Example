package example2.com;

public class User {
    private int userID ; 
    private String name;
    private String addresse;
    private String phoneNumber;

    public User(){}

    public User(int userID , String name , String addresse , String phoneNumber){
        this.userID = userID;
        this.name = name;
        this.addresse = addresse ;
        this.phoneNumber = phoneNumber ;

    }
    //getters
    public int getUserID(){
        return this.userID ;
    };
    public String getName(){
        return this.name ; 
    };
    public String getAddresse(){
        return this.addresse;
    };
    public String getPhoneNumber(){
        return this.phoneNumber;
    };

    //setters
    public void setName(String name){
        this.name = name;
    };
    public void setAddresse(String addresse){
        this.addresse = addresse;
    };
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    };


    
}
