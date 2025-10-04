package org.example.coupling.loose;

public class UserManager {
    //now here we will be using interface
    //and we can change userDatabase provider according to our need in future

    UserDataProvider userDatabaseManager=new UserDatabaseProvider();

    public String getUserInfo(){
        return userDatabaseManager.getUserDetails();
    }

    public static void main(String[] args) {
        UserManager userManager=new UserManager();
        System.out.println(userManager.getUserInfo());
    }
}
