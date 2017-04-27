package com.bizruntime.autowiredannotation;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
	
	private static final Logger LOGGER = Logger.getLogger(Consumer.class);
	public static void main(String[] args) {
		ApplicationContext  context = new ClassPathXmlApplicationContext("AutoWired_Annotation.xml");
		Collage collage = (Collage) context.getBean("collage");
		Collage collage1 = (Collage) context.getBean(Collage.class);
		LOGGER.debug("Passing Year is :"+collage.getStudent().getPassingYear());		
		LOGGER.debug(collage == collage1);
	}
}
