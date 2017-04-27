package com.bizruntime.exampleonexception;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;

public class SimpleRouteBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        onException(CamelCustomException.class).process(new Processor() {

            public void process(Exchange exchange) throws Exception {
                System.out.println("handling ex");
            }
        }).log("Received body ${body}").handled(true);

        from("file:C:/inputFolder?noop=true").process(new MyProcessor()).to("file:C:/outputFolder");

        from("file:src/data?noop=true").process(new MyProcessor()).to("file:file:target/messages/uk");
    }

}
