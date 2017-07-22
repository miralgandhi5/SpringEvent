package events;

import events.customEvents.CustomPublisher;
import events.customEvents.Email;
import events.customEvents.EmailEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainEvent {

  public static void main(String[] args) {
    ConfigurableApplicationContext context =
            new ClassPathXmlApplicationContext("Beans.xml");
    context.start();

    CustomPublisher publisher= (CustomPublisher) context.getBean("customPublisher");

    Email email=new Email().setToMail("abc.tothenew.com")
        .setSubject("Test mail for Synchronous Event")
        .setBody("Hi, \n Today's session is Spring Event and Integration");

    EmailEvent emailEvent=new EmailEvent(email);
    publisher.publish(emailEvent);
    context.stop();
  }
}
