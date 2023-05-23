package Tut.W11.Problem3;

public class Person {
    private String name;
    private String[] messages;
    private SendingThread sender;
    private ReceivingThread receiver;

    public Person(String name, String[] messages) {
        this.name = name;
        this.messages = messages;
    }

    public void setChannel(SendingThread sender, ReceivingThread receiver) {
        this.sender = new SendingThread();
        this.receiver = new ReceivingThread();
    }

    public void start() {
        this.sender.start();
        this.receiver.start();
    }


}
