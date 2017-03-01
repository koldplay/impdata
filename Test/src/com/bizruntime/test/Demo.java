package com.bizruntime.test;

public class Demo {
	private static int count;
	public static synchronized void inccount(){
		count++;
	}
	public static void main(String[] args) {
		
	
		
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 10000; i++) {
					inccount();
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 10000; i++) {
					inccount();
				}
			}
		});
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		System.out.println("Value " + count);
	}
}
