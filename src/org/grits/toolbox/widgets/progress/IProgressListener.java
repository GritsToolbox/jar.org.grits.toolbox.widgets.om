package org.grits.toolbox.widgets.progress;

/**
 * Interface defining the needed methods for a threaded progress bar.
 * 
 * @author D Brent Weatherly (dbrentw@uga.edu)
 *
 */
public interface IProgressListener {
	public enum ProgressType {Determinant, Indeterminant};
	public void setProgressMessage( String _sMessage );
	public void setProgressValue( int _iValue );
	public void setMaxValue( int _iValue );
	public void setMinValue( int _iValue );
	public void setError( String _sMessage );
	public void setError( String _sMessage, Throwable _t );
	public void setProgressType( ProgressType progressType );
}
