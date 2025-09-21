package org.example.IOC;

class EmailServiceLooseCoupling implements MessageService{

    @Override
    public String getMessage() {
        return "This is an Example of loose coupling";
    }
}

public class SMSClientLooseCoupling {
    private MessageService messageService;

    // now spring framework will inject this dependency at the runtime

    SMSClientLooseCoupling(MessageService messageService){
        this.messageService=messageService;
    }

    public  void sendMessage(){
        System.out.println(messageService.getMessage());
    }



}
