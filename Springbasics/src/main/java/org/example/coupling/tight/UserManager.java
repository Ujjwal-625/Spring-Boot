package org.example.coupling.tight;

public class UserManager {
    UserDatabaseManager userDatabaseManager=new UserDatabaseManager();

    public String getUserInfo(){
        return userDatabaseManager.getUserDetails();
    }

    public static void main(String[] args) {
        UserManager userManager=new UserManager();
        System.out.println(userManager.getUserInfo());
    }
}
