package study.beans;

import java.util.GregorianCalendar;

public class MessageBean {

    private String message;
    private String sender;
    private GregorianCalendar dateOfMessage;
    private AddressBean address;

    public MessageBean(String message,AddressBean address, String sender, GregorianCalendar dateOfMessage) {
         this.message = message;
         this.sender = sender;
         this.dateOfMessage = dateOfMessage;
         this.address = address;

    }

    public MessageBean(){
        System.out.println("MessageBean created");
    }

    public AddressBean getAddress() {
        return address;
    }

    public void setAddress(AddressBean address) {
        this.address = address;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public GregorianCalendar getDateOfMessage() {
        return dateOfMessage;
    }

    public void setDateOfMessage(GregorianCalendar dateOfMessage) {
        this.dateOfMessage = dateOfMessage;
    }

    @Override
    public String toString() {
        return "MessageBean{" +
                "message='" + message + '\'' +
                ", sender='" + sender + '\'' +
                ", dateOfMessage=" + dateOfMessage +
                '}';
    }
}
