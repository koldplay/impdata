package com.bizrunitme.jsonobject;

import org.apache.camel.Exchange;
import org.apache.log4j.Logger;

public class MethodInvoke {
	
	private final static Logger LOGGER = Logger.getLogger(MethodInvoke.class);
	public void dataPerson(Exchange exchange) {
		LOGGER.info("Details of Person");
		
		Person person = exchange.getIn().getBody(Person.class);
	
		LOGGER.info(person.getFirstName());
		LOGGER.info(person.getLastName());
		LOGGER.info(person.getCity());
	}
	
}
