package lld04.polymorphism;

public class User {
    //Common attributes for all the users

    private String id;
    private String userName;
    private String email;
    private String password;



    public User(String id, String userName, String email){
        this.id = id;
        this.userName = userName;
        this.email = email;
    }

    public String getRole(){
        return "USER";
    }

    public void signup(){
        // create a new password
        // encode the password and return back it to the user
    }

    // getting the userName from the object it-self
    public boolean login(String enteredPassword){
        // checking if the object has the same password stored in it as the password entered currently
        return this.password.equals(enteredPassword);
    }

    public void logout(){
        System.out.println(this.userName +"logged out");
    }

    public String getEmail() {
        return email;
    }

    public String getUserName(){
        return userName;
    }
}
