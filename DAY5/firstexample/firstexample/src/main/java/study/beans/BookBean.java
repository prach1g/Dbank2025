package study.beans;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class BookBean {

    private String name;
    private AddressBean addressOfPublisher;

    public  BookBean() {
         name="Book";
         addressOfPublisher=new AddressBean("AA","CC","PP");
    }

    public String getName() {
            return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AddressBean getAddressOfPublisher() {
        return addressOfPublisher;
    }

    public void setAddressOfPublisher(AddressBean addressOfPublisher) {
        this.addressOfPublisher = addressOfPublisher;
    }
}

