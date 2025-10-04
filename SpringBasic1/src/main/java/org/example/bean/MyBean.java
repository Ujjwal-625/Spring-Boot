package org.example.bean;

public class MyBean {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "This is MyBean "+" message = "+ message+" \n";
    }

    public void showMessage(){
        System.out.println(message);
    }
}
