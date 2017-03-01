package com.bizruntime.test;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadPool implements Runnable{
	String message1 ;
	public TestThreadPool(String message) {
		this.message1 = message;
	}
	public void run(){
		System.out.println(Thread.currentThread().getName()+"(Start)message"+message1);
		processmessage();
		System.out.println(Thread.currentThread().getName()+"End");
	}
	private void processmessage(){
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
class WorkerThread{
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 10; i++) {
			Runnable worker = new TestThreadPool(""+i);
			executorService.execute(worker);
		}
		executorService.shutdown();
		while (!executorService.isTerminated()) {}
		System.out.println("Finally all thread finished" );
	}
}