package org.example.coupling.loose;

public class AnotherDatabaseProvider implements UserDataProvider{
    @Override
    public String getUserDetails() {
        return "another database provider ";
    }
}
