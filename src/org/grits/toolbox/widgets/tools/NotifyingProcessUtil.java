package org.grits.toolbox.widgets.tools;

import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.grits.toolbox.widgets.progress.IProgressListener;
import org.grits.toolbox.widgets.progress.IProgressListener.ProgressType;

/**
 * Utility class of methods for updating IProgressListeners, particularly the progress bars.
 * 
 * @author D Brent Weatherly (dbrentw@uga.edu)
 *
 */
public class NotifyingProcessUtil {
	private static final Logger logger = Logger.getLogger(NotifyingProcessUtil.class);

	public static void setProgressType( List<IProgressListener> lProgressListeners, ProgressType progressType ) {
		try {
			if( lProgressListeners == null || lProgressListeners.isEmpty() ) {
				return;
			}
			Iterator<IProgressListener> i = lProgressListeners.iterator();
			while( i.hasNext() ) {
				IProgressListener listener = i.next();
				listener.setProgressType(progressType);				
			} 
		} catch( Exception e ) {
			logger.error(e.getMessage(), e);			
		}
	}
	
	public static void setMaxValue( List<IProgressListener> lProgressListeners, int _iVal ) {
		try {
			if( lProgressListeners == null || lProgressListeners.isEmpty() ) {
				return;
			}
			Iterator<IProgressListener> i = lProgressListeners.iterator();
			while( i.hasNext() ) {
				IProgressListener listener = i.next();
				if( _iVal >= 0 ) {
					listener.setMaxValue(_iVal);
				}
			} 
		} catch( Exception e ) {
			logger.error(e.getMessage(), e);			
		}
	}

	public static void updateListeners( List<IProgressListener> lProgressListeners, String _sMsg, int _iVal ) {
		try {
			if( lProgressListeners == null || lProgressListeners.isEmpty() ) {
				return;
			}
			Iterator<IProgressListener> i = lProgressListeners.iterator();
			while( i.hasNext() ) {
				IProgressListener listener = i.next();
				listener.setProgressMessage(_sMsg);
				if( _iVal >= 0 ) {
					listener.setProgressValue(_iVal);
				}
			} 
		} catch( Exception e ) {
			logger.error(e.getMessage(), e);			
		}
	}

	public static void updateErrorListener(List<IProgressListener> lProgressListeners, String _sMsg) {
		try {
			if( lProgressListeners == null || lProgressListeners.isEmpty() ) {
				return;
			}
			Iterator<IProgressListener> i = lProgressListeners.iterator();
			while( i.hasNext() ) {
				IProgressListener listener = i.next();
				listener.setError(_sMsg);
			} 
		} catch( Exception e ) {
			logger.error(e.getMessage(), e);			
		}
	}

	public static void updateErrorListener(List<IProgressListener> lProgressListeners, String _sMsg, Throwable t) {
		try {
			if( lProgressListeners == null || lProgressListeners.isEmpty() ) {
				return;
			}
			Iterator<IProgressListener> i = lProgressListeners.iterator();
			while( i.hasNext() ) {
				IProgressListener listener = i.next();
				listener.setError(_sMsg, t);
			} 
		} catch( Exception e ) {
			logger.error(e.getMessage(), e);			
		}
	}
}
