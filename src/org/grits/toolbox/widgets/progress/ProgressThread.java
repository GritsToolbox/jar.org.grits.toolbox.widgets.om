package org.grits.toolbox.widgets.progress;


/**
 * Abstract class for associating a progress handler with a thread. User must define methods
 * to start and cancel work.
 *  
 * @author D Brent Weatherly (dbrentw@uga.edu)
 *
 */
public abstract class ProgressThread extends Thread
{
    private IProgressThreadHandler m_progressThreadHandler = null;
    private boolean isFinished = false;
    
    public void setProgressThreadHandler(IProgressThreadHandler a_dialog)
    {
        this.m_progressThreadHandler = a_dialog;
    }
    
    /**
     * When start() is called in Thread class, this class will be invoked!
     */
    public void run() 
    {
		try {
			boolean successful = this.threadStart(this.m_progressThreadHandler);
			this.isFinished = true;
			this.m_progressThreadHandler.threadFinished(successful);
		} catch (Exception e) {
			this.isFinished = true;
			this.m_progressThreadHandler.endWithException(e);
		}
    }

    public boolean isFinished() {
		return isFinished;
	}
    
    public abstract boolean threadStart(IProgressThreadHandler a_progressBarDialog) throws Exception;
    
    public abstract void cancelWork();
}

