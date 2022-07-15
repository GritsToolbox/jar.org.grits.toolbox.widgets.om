package org.grits.toolbox.widgets.tools;

import java.util.List;

/**
 * Simple interface for event notification. Contains a list of classes (IGRITSEventListener) that listen for changes.
 * 
 * @author D Brent Weatherly (dbrentw@uga.edu)
 *
 */
public interface IGRITSEventHandler {
	public void notifyListeners( int iEventType );
	public List<IGRITSEventListener> getEventListeners();
	public void addEventListener(IGRITSEventListener eventListener);
	public void removeEventListener(IGRITSEventListener eventListener);
}
