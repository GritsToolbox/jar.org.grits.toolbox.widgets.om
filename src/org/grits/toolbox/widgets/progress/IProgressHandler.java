package org.grits.toolbox.widgets.progress;

import org.grits.toolbox.widgets.tools.GRITSWorker;

/**
 * Interface that joins a thread with a GRITS worker.
 * 
 * @author D Brent Weatherly (dbrentw@uga.edu)
 *
 */
public interface IProgressHandler {
	public void setThread(CancelableThread _progressThread);
	public void setGritsWorker(GRITSWorker gritsWorker);
}
