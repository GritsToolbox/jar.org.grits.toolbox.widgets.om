package org.grits.toolbox.widgets.tools;


/**
 * Abstract class defining a worker process in GRITS. Supports the GRITS progress bar and notification system. 
 * 
 * @author D Brent Weatherly (dbrentw@uga.edu)
 *
 */
public abstract class GRITSWorker extends NotifyingProcess {
	
	public abstract int doWork();
}
