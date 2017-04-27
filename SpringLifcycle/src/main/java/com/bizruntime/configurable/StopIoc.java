package com.bizruntime.configurable;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

public class StopIoc implements ApplicationListener<ContextStoppedEvent> {

	public void onApplicationEvent(ContextStoppedEvent arg0) {
		System.out.println("On stop ............");
	}

}
