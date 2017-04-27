package com.bizruntime.exampleonexception;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("META-INF/spring/applicationContext-camel.xml");
        ctx.start();
        System.out.println("Application context started");
        try {
            Thread.sleep(5 * 60 * 1000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        ctx.stop();
        ctx.close();
	}
}
