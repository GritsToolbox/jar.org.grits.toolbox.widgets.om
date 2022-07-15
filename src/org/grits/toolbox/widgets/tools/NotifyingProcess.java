package org.grits.toolbox.widgets.tools;

import java.util.ArrayList;
import java.util.List;

import org.grits.toolbox.widgets.progress.IProgressListener;
import org.grits.toolbox.widgets.progress.IProgressListener.ProgressType;

/**
 * Base implementing class of an INotifyingProcess. 
 * 
 * @author D Brent Weatherly (dbrentw@uga.edu)
 *
 */
public class NotifyingProcess implements INotifyingProcess {
	protected boolean isCanceled = false;
	protected List<IProgressListener> lProgressListeners;

	public NotifyingProcess() {
		lProgressListeners = new ArrayList<>();		
	}
	
	public void setProgressListeners(List<IProgressListener> lProgressListeners) {
		this.lProgressListeners = lProgressListeners;
	}
	
	public List<IProgressListener> getProgressListeners() {
		return lProgressListeners;
	}

	public void addProgressListeners(IProgressListener lProgressListener) {
		this.lProgressListeners.add(lProgressListener);
	}
	
	public boolean isCanceled() {
		return isCanceled;
	}
	
	public void setCanceled(boolean isCanceled) {
		this.isCanceled = isCanceled;
	}

	@Override
	public void updateListeners( String _sMsg, int _iVal ) {
		NotifyingProcessUtil.updateListeners(getProgressListeners(), _sMsg, _iVal);
	}
	
	@Override
	public void updateErrorListener(String _sMsg) {
		NotifyingProcessUtil.updateErrorListener(getProgressListeners(), _sMsg);
	}

	@Override
	public void updateErrorListener(String _sMsg, Throwable t) {
		NotifyingProcessUtil.updateErrorListener(getProgressListeners(), _sMsg, t);
	}

	@Override
	public void setMaxValue(int _iVal) {
		NotifyingProcessUtil.setMaxValue(getProgressListeners(), _iVal);		
	}

	@Override
	public void setProgressType(ProgressType progressType) {
		NotifyingProcessUtil.setProgressType(getProgressListeners(), progressType);		
	}
}
