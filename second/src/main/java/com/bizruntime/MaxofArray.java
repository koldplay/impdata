package com.bizruntime;

import java.util.StringTokenizer;

public class MaxofArray 
{
	public static int maxValue(int arr[])
	{
		int max=arr[0];
		for (int i = 0; i < arr.length; i++) 
		{
			if (max<arr[i]) 
			{
				max = arr[i];
			}
		}
		return max ;
	}
	public int cubeOfNo(int n)
	{
		return n*n*n;
	}

	//reverse String words
	public static String reveseStr(String str)
	{
		StringBuilder result = new StringBuilder();
		StringTokenizer st = new StringTokenizer(str, "");
		
		while (st.hasMoreTokens()) 
		{
			StringBuilder sb1 = new StringBuilder();
			sb1.append(st.nextToken());
			sb1.reverse();
			result.append(sb1);
			result.append("");
		}
		return result.toString();
	}
	public static String firstElementCapital(String str)
	{
		StringBuilder res = new StringBuilder();
		StringTokenizer token = new StringTokenizer(str, "");
		while (token.hasMoreTokens()) 
		{
			StringBuilder sb = new StringBuilder();
			sb.append(token.nextToken());
			sb.replace(0, 1, str.toUpperCase());
		}
		return res.toString();
	}
	public int cubeOfArray(int[] a)
	{
		int i = 0;
		for (int j = 0; j < a.length-1; j++) 
		{
			i = a[j];
		}
		int value = (int)Math.pow(3, i);
		System.out.println(value);
		return value;
	}
}
