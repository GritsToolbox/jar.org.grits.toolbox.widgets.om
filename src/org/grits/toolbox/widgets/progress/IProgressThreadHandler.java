package org.grits.toolbox.widgets.progress;

/**
 * Interface of a handler for a thread for a GRITS worker. Allows cancel and handling when a thread finishes.
 * 
 * @author D Brent Weatherly (dbrentw@uga.edu)
 *
 */
public interface IProgressThreadHandler {
	public void threadFinished(boolean _bSuccess);
	public void endWithException(Exception e);
	public void cancelThread();
	public boolean isCanceled();
}
