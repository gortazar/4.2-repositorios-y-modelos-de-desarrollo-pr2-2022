package es.urjc.code.daw.library.notification;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EventBasedNotificationService implements NotificationService {
	
	private ApplicationEventPublisher publisher;
	
	public EventBasedNotificationService(ApplicationEventPublisher applicationEventPublisher) {
		this.publisher = applicationEventPublisher;
	}

	public void notify(String message) {
		publisher.publishEvent(message);
	}

}
