package org.example.practice;

public class AnotherDatabaseProvider implements UserDataProvider{
    @Override
    public String getUserDetails() {
        return "another database provider ";
    }
}
