package org.example.coupling.loose;

import org.example.coupling.tight.UserDatabaseManager;

public class UserManager {
    //now here we will be using interface
//      and we can change userDatabase provider according to our need in future

    UserDataProvider databaseProvider;

    UserManager(UserDataProvider databaseProvider){
        this.databaseProvider=databaseProvider;
    }

    public String getUserInfo(){
        return databaseProvider.getUserDetails();
    }

    public static void main(String[] args) {
        UserManager userManager=new UserManager(new UserDatabaseProvider());
        System.out.println(userManager.getUserInfo());

        //now we can call another database provider without any compications

        UserManager userManager1=new UserManager(new AnotherDatabaseProvider());

        System.out.println(userManager1.getUserInfo());

        System.out.println();
    }
}
