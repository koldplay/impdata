package com.bizruntime;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestApp 
{
	public static void main(String[] args) 
	{
		File f1 = new File("D:\\task1\\Ex1StockTrade\\CISCO.csv");
		try(FileReader reader = new FileReader(f1);
			BufferedReader buf = new BufferedReader(reader)	) 
		{
			String s1 = buf.readLine();
			while (s1!=null) 
			{
				System.out.println(s1);
				s1 = buf.readLine();
			}
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
