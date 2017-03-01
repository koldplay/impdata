package com.bizruntime;

/**
 * Hello world!
 *
 */
public class App 
{	
	public String truncate(String str)
	{
		if (str.length() <= 2) 
		return str.replace("A", "");
		
		String first2Char = str.substring(0,2);
		String minusFirst2Char = str.substring(2);
		
		return first2Char.replaceAll("A", "")+ minusFirst2Char;
	}
	public boolean areFirstLastChartoBeSame(String str)
	{
		if (str.length() == 1) 
			return false;
		if (str.length() == 2) 
			return true;
		String firstChar = str.substring(0,2);
		String lastChar = str.substring(str.length()- 2);
		
		return firstChar.equals(lastChar);
	}
	
	
}
