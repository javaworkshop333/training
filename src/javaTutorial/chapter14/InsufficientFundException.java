package javaTutorial.chapter14;

public class InsufficientFundException extends Exception{

	public String message;
	public String errorCode;
	
	public InsufficientFundException(String errorCode,String errormsg)
	{
		super(errormsg);
		message=errormsg;
		this.errorCode=errorCode;
	}
	
	public String getMessage()
	{
		String errorMsg= "Not enough fund :"+message;
		return errorMsg;
	}
}
