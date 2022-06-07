package es.urjc.code.daw.library.notification;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EventBasedNotificationListener {

    Logger logger = LoggerFactory.getLogger(EventBasedNotificationListener.class);
    
	@EventListener
	public void process(String message) {
		logger.info("Async: " + message);
	}
	
}
