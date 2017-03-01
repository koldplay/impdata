package com.bizruntime.test;

public class MyRunnableThread implements Runnable{
	
	public static int count = 0;
	public MyRunnableThread(){
		
	}
	public void run() {
		while (MyRunnableThread.count <= 10 ) {
			try {
				System.out.println("Expl Thread" + (++MyRunnableThread.count));
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
