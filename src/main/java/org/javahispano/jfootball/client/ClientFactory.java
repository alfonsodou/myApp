/**
 * 
 */
package org.javahispano.jfootball.client;

import com.google.web.bindery.event.shared.EventBus;

/**
 * @author alfonso
 *
 */
public interface ClientFactory {
	public EventBus getEventBus();
}
