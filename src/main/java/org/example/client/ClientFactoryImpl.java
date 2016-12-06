/**
 * 
 */
package org.example.client;

import com.google.gwt.event.shared.SimpleEventBus;
import com.google.web.bindery.event.shared.EventBus;

/**
 * @author alfonso
 *
 */
public class ClientFactoryImpl implements ClientFactory {
	private static EventBus eventBus;

	@Override
	public EventBus getEventBus() {
		if (eventBus == null)
			eventBus = new SimpleEventBus();
		return eventBus;
	}

}
