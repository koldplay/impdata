package com.bizruntime.test;

public class TestShutdown1 {
	public static void main(String[] args) {
		Runtime run  = Runtime.getRuntime();
		run.addShutdownHook(new MyThread());
		
		System.out.println("Now main thread is sleeping press ctrl+c");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
