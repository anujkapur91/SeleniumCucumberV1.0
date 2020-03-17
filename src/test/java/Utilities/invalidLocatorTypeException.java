package Utilities;

@SuppressWarnings("serial")
public class invalidLocatorTypeException extends Exception{
	static String msg;
	private static String date;
	public invalidLocatorTypeException(String Message)
	{
		super(Message);
		invalidLocatorTypeException.msg = Message;
	}
	
	
	public  void publishOnReport(String LocatorType, String Locatorname)
	{
		System.out.println("Locator type " + LocatorType +" is not a proper locator type for - " +Locatorname);
	}
	

}
