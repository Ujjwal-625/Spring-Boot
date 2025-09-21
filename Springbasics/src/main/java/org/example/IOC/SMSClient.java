package org.example.IOC;

interface MessageService{
    String getMessage();
}

class EmailService implements MessageService{

    @Override
    public String getMessage() {
        return "This is an Example of tight coupling";
    }
}

public class SMSClient {
    private MessageService messageService;
    public SMSClient(){
        this.messageService=new EmailService();//dependency
        //this is an example of tight coupling
    }

    public  void sendMessage(){
        System.out.println(messageService.getMessage());
    }

    public static void main(String[] args) {
        SMSClient client=new SMSClient();
        client.sendMessage();
    }
}
