package com.bizruntime.file.CamelProjectFile;

import java.util.Arrays;
import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.dataformat.xmljson.XmlJsonDataFormat;
import org.apache.camel.impl.DefaultCamelContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlToJson {
	
	public static void main(String[] args) throws Exception {
//		XmlJsonDataFormat format = new XmlJsonDataFormat();
//		format.setEncoding("UTF-8");
//		format.setForceTopLevelObject(true);
//		format.setTrimSpaces(true);
//		format.setRootName("newRoot");
//		format.setRemoveNamespacePrefixes(true);
//		format.setRemoveNamespacePrefixes(true);
//		format.setExpandableProperties(Arrays.asList("d","e"));
		
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/Camel-xmltojson.xml");
		CamelContext camelContext = new DefaultCamelContext();
//		camelContext.addRoutes(new RouteBuilder() {
//			
//			@Override
//			public void configure() throws Exception {
//				System.out.println("data");
//				from("file:src/data?fileName=message1.xml;noop=true;")
//				.log("${body}")
//				.marshal(format)		
//				.to("file:target/data?fileName=msg.json");
//				System.out.println("done");
//			}
//		});
		camelContext.start();
		Thread.sleep(2000);
		camelContext.stop();
		
	}
}
