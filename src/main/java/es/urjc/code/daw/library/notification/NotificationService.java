package es.urjc.code.daw.library.notification;

import org.springframework.stereotype.Component;
import org.togglz.core.manager.FeatureManager;

import es.urjc.code.daw.library.Features;

@Component
public class NotificationService {

	private EventBasedNotificationService eventNotifier;
	private SynchronousNotificationService syncNotifier;
	private FeatureManager featureManager;

	public NotificationService(EventBasedNotificationService eventNotifier, SynchronousNotificationService syncNotifier, FeatureManager featureManager) {
		this.eventNotifier = eventNotifier;
		this.syncNotifier = syncNotifier;
		this.featureManager = featureManager;
	}

	public void notify(String message) {
		if(featureManager.isActive(Features.EVENT_NOTIFICATION_TOGGLE)) {
			eventNotifier.notify(message);
		} else {
			syncNotifier.notify(message);
		}
	}
	
}
