package org.example.coupling.loose;

//loose coupling using interface



public class UserDatabaseProvider implements UserDataProvider{
    public String getUserDetails(){
        return "These are some of the user details from user database manager";
    }
}
