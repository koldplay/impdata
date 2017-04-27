package cmo.bizruntime.restletdatareading;

import org.apache.camel.CamelContext;
import org.apache.camel.spring.SpringCamelContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RestLetMethodInvoke {

	public static void main(String[] args) throws Exception  {
		ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/camel-restmethodinvoke.xml");
		CamelContext camelContext = new SpringCamelContext(context);
		camelContext.start();
		Thread.sleep(200);
		camelContext.stop();
	}
}
