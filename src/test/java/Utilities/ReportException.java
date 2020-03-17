package Utilities;

public class ReportException {
	
	
	public static void reportExceptionToExtentReport(Exception exp)
	
	{
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$  Reporting exceptions here $$$$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println("Exception occured of type " + exp.getClass().toGenericString());
//		exp.printStackTrace();
//		switch(exp.getClass().toGenericString())
//		{
//		
//		}
		
	}
		
		
	}

