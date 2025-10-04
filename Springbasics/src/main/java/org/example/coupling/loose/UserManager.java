package org.example.coupling.loose;

public class UserManager {
    //now here we will be using interface
//      and we can change userDatabase provider according to our need in future

    UserDataProvider databaseProvider;

    UserManager(UserDatabaseProvider databaseProvider){
        this.databaseProvider=databaseProvider;
    }

    public String getUserInfo(){
        return databaseProvider.getUserDetails();
    }

    public static void main(String[] args) {
        UserManager userManager=new UserManager(new UserDatabaseProvider());
        System.out.println(userManager.getUserInfo());
    }
}
