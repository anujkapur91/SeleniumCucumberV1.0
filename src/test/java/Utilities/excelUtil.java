package Utilities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

import UILibrary.Actions;

public class excelUtil 
{

	private static final Logger logwriter = LogManager.getLogger(Actions.class);


	public static void main(String...strings){
		//		System.out.println(loadComponentData("Sheet1","2"));
		String s1 = "abc";
		String s2 ="abc";
		String s3 = new String("abc");
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));


	}

	public static Map<String,String> loadComponentData(String Component, String RowID)
	{

		Fillo fillo=new Fillo();
		Connection connection = null;
		Recordset recordset = null;
		Map <String,String> input = new HashMap<String, String>() ;
		String key =null;
		String value = null;

		try 
		{
			connection = fillo.getConnection("./Test2.xlsx");
		} catch (FilloException e) {
			// TODO Auto-generated catch block
			logwriter.error("Input data sheet not found at specified location");
			e.printStackTrace();
		}


		String strQuery="Select * from "+Component +" where rowID ='"+RowID+"'";

		try 
		{
			recordset=connection.executeQuery(strQuery);
			ArrayList<String> fieldsName = recordset.getFieldNames();
			while(recordset.next()){
				for(String s : fieldsName)
				{
					key = s;
					value = recordset.getField(s);
					input.put(key, value);
					System.out.println(input.get(s));

				}
			}

		} catch (FilloException e) {
			// TODO Auto-generated catch block
			logwriter.error("Please check that rowID - "+RowID+" at Sheet with name -"+Component);
			e.printStackTrace();
		}

		return input;

	}

	//	public static void testFillo() throws FilloException
	//	{
	//		Fillo fillo=new Fillo();
	//		Connection connection=fillo.getConnection("./Test.xlsx");
	//		String strQuery="Select * from Sheet1 ";
	//		Recordset recordset=connection.executeQuery(strQuery);
	//
	//		ArrayList<String> fieldsName = recordset.getFieldNames();
	//
	//		while(recordset.next()){
	//
	//			for(String s : fieldsName)
	//			{
	//				System.out.print(recordset.getField(s)+"|");
	//			}
	//
	//			System.out.print("\n");
	//		}
	//
	//
	//
	//
	//		recordset.close();
	//		connection.close();
	//	}



}
