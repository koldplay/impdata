package com.bizruntime.test;

public class RunMyThread {
	public static void main(String[] args) {
		System.out.println("Starting main thread");
		MyRunnableThread myrun = new MyRunnableThread();
		Thread thread = new Thread(myrun);
		thread.start();
		while (MyRunnableThread.count <= 10) {
			try {
				System.out.println("Main Thread "+ (++MyRunnableThread.count));
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("End of main Thread");
	}
}
