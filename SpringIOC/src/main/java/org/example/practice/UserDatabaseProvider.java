package org.example.practice;

//loose coupling using interface



public class UserDatabaseProvider implements UserDataProvider{
    public String getUserDetails(){
        return "These are some of the user details from user database manager";
    }
}
