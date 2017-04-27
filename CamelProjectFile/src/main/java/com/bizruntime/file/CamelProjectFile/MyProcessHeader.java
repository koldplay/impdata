package com.bizruntime.file.CamelProjectFile;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.log4j.Logger;

public class MyProcessHeader implements Processor {

	private final static Logger LOGGER = Logger.getLogger(MyProcessHeader.class);
	@Override
	public void process(Exchange exchange) throws Exception {
		String body = exchange.getIn().getBody(String.class);
		LOGGER.info("Body Gets Printed "+body);
		exchange.getIn().setHeader("dtat  ", "data");		
		LOGGER.info(exchange.getIn().getHeaders());		
	}
	
	
}
