package stepDefinations;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;

public class CodeTest 
{
	int i = 5;
	//	
	//	static String s = "a,h,1,4,5,6,8,3,4,6,y,f,r,y,7,8,8,#,@,#,@,5,";
	//	
	//	public static  void printMyMsg(String m)
	//	{
	//		System.out.println("-----------------------------------------------------------------");
	//		System.out.println(m);
	//		System.out.println("-----------------------------------------------------------------");
	//	}
	//	
	//	public static void main(String args[])
	//	{
	//		ArrayList<String> li = new ArrayList<String>();
	//		li.addAll(Arrays.asList(s.split(",")));
	//		
	//		
	//		printMyMsg("Mixed list of size - " + li.size());
	//		
	//		ArrayList<Integer> IntList = new ArrayList<Integer>();
	//		
	// 		for(String s : li)
	//		{
	//			try {
	//				IntList.add(Integer.parseInt(s));
	//			} catch (NumberFormatException e) {
	//				// TODO Auto-generated catch block
	//			}
	//		}
	// 		
	// 		printMyMsg("Integer List of size - " + IntList.size());
	// 		
	//		Map<Integer, Integer> m = new HashMap<Integer,Integer>();
	//		
	//		for(int i : IntList)
	//		{
	//			if(m.containsKey(i))
	//			{
	//				m.put(i, m.get(i)+1);
	//			} 
	//			else
	//			{
	//				m.put(i, 1);
	//			}
	//		}
	//		
	//		
	//		for(Map.Entry<Integer, Integer> x:m.entrySet())
	//		{
	//			printMyMsg("Frequency of - " + x.getKey() + " is - " + x.getValue() );
	//		}
	//		printMyMsg("The End");
	//	}
	//  



	public static void main(String agrs[])
	{


		String  arr[] = {"abc.doc","abc.txt","abc.xlsx","abc.txt","abc.fgh","fghj.fg.doc"};
		
		Map<String,Integer> m = new HashMap<String,Integer>();

		for (String a : arr)
		{
			String ss  = a.substring(a.lastIndexOf(".")); 
			if(m.containsKey(ss))
			{
				m.put(ss,m.get(ss)+1);
			}
			else
			{
				m.put(ss, 1);
			}
			
			
			
		}
		
		System.out.println(m);
		

	}
}

