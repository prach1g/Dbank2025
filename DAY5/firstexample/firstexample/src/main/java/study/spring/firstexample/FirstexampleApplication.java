package study.spring.firstexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import study.beans.BookBean;
import study.config.MyConfig;
import study.beans.MessageBean;

//@SpringBootApplication
public class FirstexampleApplication {

	public static void main(String[] args) {

		//SpringApplication.run(FirstexampleApplication.class, args);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		context.scan("study.beans");
    	MessageBean obj =context.getBean("b1",MessageBean.class);
	MessageBean obj2 =context.getBean("b2",MessageBean.class);

		obj.setSender("rohini");

		System.out.println(obj.getMessage()+" : "+obj.getSender()+" "+obj.getAddress());
		System.out.println(obj2.getMessage()+" : "+obj2.getSender());

		BookBean book = context.getBean(BookBean.class);
		System.out.println(book.getName()+" "+book.getAddressOfPublisher().getCity());

	}//end of main

}//end of class
