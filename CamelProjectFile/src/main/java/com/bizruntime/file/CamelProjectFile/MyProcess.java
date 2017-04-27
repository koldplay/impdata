package com.bizruntime.file.CamelProjectFile;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.log4j.Logger;

public class MyProcess implements Processor {
	private final static Logger LOGGER = Logger.getLogger(MyProcess.class);

	@Override
	public void process(Exchange exchange) throws Exception {
		String body = exchange.getIn().getBody(String.class);
		LOGGER.info("body of message "+body);
		exchange.getIn().setBody(body+"1");
		String bodyagain = exchange.getIn().getBody(String.class);
		
		LOGGER.info(Exchange.ACCEPT_CONTENT_TYPE);
		LOGGER.info(Exchange.AGGREGATED_COLLECTION_GUARD);
		LOGGER.info(Exchange.AGGREGATED_COMPLETED_BY);
		LOGGER.info(Exchange.AGGREGATED_CORRELATION_KEY);
		LOGGER.info("body again of message "+bodyagain);
	}

}

