package study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import study.beans.AddressBean;
import study.beans.MessageBean;

import java.util.GregorianCalendar;

public class MyConfig {

      @Bean(name = "b1")
      @Lazy(value = true)
     // @Scope(value = "prototype")
      public MessageBean getMsgBean(AddressBean address,GregorianCalendar gc) //DI
      {
          MessageBean msgBean = new MessageBean();
          msgBean.setMessage("Hello World");
          msgBean.setSender("prachi");
          msgBean.setDateOfMessage(gc);
          //msgBean.setAddress(new AddressBean()); //WRONG
          msgBean.setAddress(address);
          return msgBean;
      }

      @Bean
      public GregorianCalendar getDateOfMessage()
      {
          return new GregorianCalendar();
      }



    @Bean(name = "b2")
    @Scope(value = "prototype")
    public MessageBean getMsgBean2()
    {
        MessageBean msgBean = new MessageBean();
        msgBean.setMessage("Good Bye");
        msgBean.setSender("preeti");
        msgBean.setDateOfMessage(new GregorianCalendar());
        return msgBean;
    }

    @Bean
    public AddressBean getaddressBean()
    {
        AddressBean addressBean = new AddressBean();
        addressBean.setCity("Pune");
        addressBean.setArea("XYZ");
        addressBean.setPin("11223344");
        return addressBean;
    }

}//end of class
