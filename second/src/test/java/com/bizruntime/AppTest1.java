package com.bizruntime;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class AppTest1 extends TestCase 
{
	App a1;
	
	@Before
	public void before()
	{
		a1 = new App();
	}
	@After
	public void after()
	{
		a1 = null;
	}
//	@Test
//	public void testTruncate() 
//	{
//		assertEquals("AA",a1.areFirstLastChartoBeSame("AA"));
//				
//	}
	@Test
	public void testAreFirstLastChartoBeSame()  
	{
		//assertFalse(a1.areFirstLastChartoBeSame(""));
		//assertFalse(a1.areFirstLastChartoBeSame("A"));
		//assertTrue(a1.areFirstLastChartoBeSame("AB"));
		//assertTrue(a1.areFirstLastChartoBeSame("AAA"));
		//assertTrue(a1.areFirstLastChartoBeSame("AAB"));
	}
	@Test
	public void testArraysSort()
	{
		int[] numbers = {5,2,9,8,1};
		Arrays.sort(numbers);
		int[] expectedOutput = {1,2,5,8,9};
		assertArrayEquals(expectedOutput, numbers);
	}
	@Test(expected=NullPointerException.class)
	public void testSortArraywithoutNullPointer()
	{
		int[] number ={2};
		Arrays.sort(number);
	}
	
	@Test
	public void testMaxValue()
	{
		assertEquals(4, MaxofArray.maxValue(new int[]{1,2,3,4}));
		assertEquals(-1, MaxofArray.maxValue(new int[]{-12,-1,-3,-4,-2}));
	}
	
	@Test
	public void testCubeOfNo()
	{
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int d =(int) Math.pow(3, i);
		MaxofArray mx = new MaxofArray();				
		assertEquals(d,mx.cubeOfNo(i));
		sc.close();
	}
	@Test
	public void testReveseStr()
	{
		 System.out.println("test case reverse word");  
		 String s1 = "max steel";
	     assertEquals(s1,MaxofArray.reveseStr("leets xam"));
	}
	@Test
	public void testTesting()  
	{
		String s1 = "abc";
		String s2 = "abc";
		boolean b1 = s1.equals(s2);				
		assertEquals(true,b1);		
	}
	
}
