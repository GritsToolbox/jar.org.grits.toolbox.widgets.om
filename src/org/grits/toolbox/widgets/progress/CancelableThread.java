package org.grits.toolbox.widgets.progress;


/**
 * Extension of a ProgressThread to facilitate support for canceling the thread.
 * 
 * @author D Brent Weatherly (dbrentw@uga.edu)
 *
 */
public class CancelableThread extends ProgressThread  {

	private volatile boolean isCanceled = false;

	@Override
	public boolean threadStart(IProgressThreadHandler a_progressThreadHandler)
			throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void cancelWork() {
		this.isCanceled = true;		
	}

	public boolean isCanceled() {
		return this.isCanceled;
	}
	 
	
}
