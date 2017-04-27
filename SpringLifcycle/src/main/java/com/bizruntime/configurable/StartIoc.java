package com.bizruntime.configurable;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class StartIoc implements ApplicationListener<ContextStartedEvent> {

	public void onApplicationEvent(ContextStartedEvent arg0) {
		System.out.println("On Start ....");
	}
	
	
}
