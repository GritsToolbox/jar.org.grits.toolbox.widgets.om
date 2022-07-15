package org.grits.toolbox.widgets.tools;

/**
 * Simple interface for event handling. This class is registered in handling class and listens for notifications.
 * 
 * @author D Brent Weatherly (dbrentw@uga.edu)
 *
 */
public interface IGRITSEventListener {
	public void handleEvent( int _iEventType );
}
