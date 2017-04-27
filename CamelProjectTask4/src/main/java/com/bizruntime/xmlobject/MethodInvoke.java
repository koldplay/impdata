package com.bizruntime.xmlobject;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.Exchange;
import org.apache.log4j.Logger;

public class MethodInvoke {

	private final static  Logger LOGGER = Logger.getLogger(MethodInvoke.class);
	
		public void dataPerson(Exchange exchange ){
			System.out.println(exchange.getIn().getBody());
			List<Person> person = (List<Person>) exchange.getIn().getBody();
			for (Person person2 : person) {
				LOGGER.info("Details of Person");
				LOGGER.info(person2.getFirstName());
				LOGGER.info(person2.getLastName());
				LOGGER.info(person2.getCity());
			}
		}
		
		public void dataPersonmarshal(Exchange exchange) {
			System.out.println(exchange.getIn().getBody());
			ArrayList<Person> persons = (ArrayList<Person>) exchange.getIn().getBody();
			for (Person person : persons) {
				LOGGER.info(person.getFirstName());
			}
		}
}
