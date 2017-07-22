package events.customEvents;

import org.springframework.context.ApplicationListener;


public class EmailListener implements ApplicationListener<EmailEvent> {
  @Override
  public void onApplicationEvent(EmailEvent event) {
    if(event.getSource() instanceof Email){
      Email email=(Email) event.getSource();
      System.out.println(email);
    }else{
      System.out.println("Not an event class!");
    }
  }
}
