package org.grits.toolbox.widgets.tools;

import java.util.List;

import org.grits.toolbox.widgets.progress.IProgressListener;
import org.grits.toolbox.widgets.progress.IProgressListener.ProgressType;

/**
 * Interface defining the needed methods for notifying IProgressListeners
 *  
 * @author D Brent Weatherly (dbrentw@uga.edu)
 *
 */
public interface INotifyingProcess {
	public void updateListeners( String _sMsg, int _iVal );
	public void updateErrorListener( String _sMsg );
	public void updateErrorListener( String _sMsg, Throwable t );
	public List<IProgressListener> getProgressListeners();
	public void setProgressListeners(List<IProgressListener> lProgressListeners);
	public void addProgressListeners(IProgressListener lProgressListener);
	public void setMaxValue(int _iVal);
	public boolean isCanceled();
	public void setCanceled(boolean _bVal);
	public void setProgressType(ProgressType progressType);
}
