package com.bizruntime.test;

class TestJoinMethod2 extends Thread{  
	 public void run(){  
		  if(Thread.currentThread().isDaemon()){//checking for daemon thread  
		   System.out.println("daemon thread work");  
		  }  
		  else{  
		  System.out.println("user thread work");  
		 }  
		 }  
		 public static void main(String[] args){  
		  TestJoinMethod2 t1=new TestJoinMethod2();//creating thread  
		  TestJoinMethod2 t2=new TestJoinMethod2();  
		  TestJoinMethod2 t3=new TestJoinMethod2();  
		  
		  t1.setDaemon(true);//now t1 is daemon thread  
		    
		  t1.start();//starting threads  
		  t2.start();  
		  t3.start();  
		 }  
	}  