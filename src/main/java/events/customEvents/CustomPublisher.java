package events.customEvents;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;


public class CustomPublisher implements ApplicationEventPublisherAware {


  private ApplicationEventPublisher publisher;

  @Override
  public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
    System.out.println("Application event Publisher is set to Custom Publisher");
    publisher=applicationEventPublisher;
  }

  public void publish(EmailEvent event){
    publisher.publishEvent(event);
  }
}
