package OOP;

/*
1. The "Plug-and-Play" Pattern
----The Goal: Understand how one interface can have multiple interchangeable implementations.
----The Problem: Create a -MessagingService- interface with a method sendMessage(String message, String recipient).
----The Task: * Implement an -EmailService-, a -SMSService-, and a -WhatsAppService-.
----Create a -NotificationHandler- class that takes a MessagingService as a constructor argument and
           uses it to send a "Welcome!" message.
Why it works: This teaches you Dependency Injection.
The NotificationHandler doesn't care how the message is sent, only that the object it holds follows the MessagingService contract.
 */
package OOP;

interface MessagingService{
    void sendMessage(String message, String recipient);
}
class EmailService implements MessagingService{
    @Override
    public void sendMessage(String message, String recipient) {
        System.out.println("Sending Email message: " + message);
        System.out.println("Sending to: " + recipient);
    }
}
class SMSService implements MessagingService{
    @Override
    public void sendMessage(String message, String recipient) {
        System.out.println("Sending SMS message: " + message);
        System.out.println("Sending to: " + recipient);
    }
}
class WhatsAppService implements MessagingService{
    @Override
    public void sendMessage(String message, String recipient) {
        System.out.println("Sending WhatsApp message: " + message);
        System.out.println("Sending to: " + recipient);
    }
}
class NotificationHandler {
    private final MessagingService messagingService;
    public NotificationHandler(MessagingService messagingService) {
        this.messagingService = messagingService;
    }
    public void sendMessage(String message, String recipient) {
        messagingService.sendMessage(message, recipient);
    }
}

public class Interface1 {
    public static void main(String[] args) {

        NotificationHandler notificationHandler = new NotificationHandler( new EmailService());
        notificationHandler.sendMessage("Welcome", "Vaibhav");

        NotificationHandler notificationHandler2 = new NotificationHandler(new SMSService());
        notificationHandler2.sendMessage("HI", "Vaibhav");

        NotificationHandler notificationHandler3 = new NotificationHandler(new WhatsAppService());
        notificationHandler3.sendMessage("HI", "Vaibhav");
    }
}

/*----Output----

Sending Email message: Welcome, Sir
Sending to: Vaibhav
Sending SMS message: HI Brother
Sending to: Vaibhav
Sending WhatsApp message: Hello, Friend
Sending to: Vaibhav

*/
