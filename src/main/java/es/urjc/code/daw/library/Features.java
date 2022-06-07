package es.urjc.code.daw.library;

import org.togglz.core.Feature;
import org.togglz.core.annotation.Label;

public enum Features implements Feature {
	
	@Label("Line breaker")
	LINE_BREAKER_TOGGLE,
	
	@Label("Event notification")
	EVENT_NOTIFICATION_TOGGLE

}
