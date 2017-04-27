package cmo.bizruntime.restletdatareading;

import org.apache.camel.Exchange;

public class Mybean {

	public void call(Exchange exchange) {
		int firstNo = Integer.parseInt((String) exchange.getIn().getHeader("Value1"));
		int secondNo = Integer.parseInt((String)exchange.getIn().getHeader("Value2"));
		System.out.println(firstNo+secondNo);
	}
		
	public void callxml(Integer param1 , Integer param2 ,Integer param3) {
		System.out.println("addition of two numbers :");
		System.out.println(param1);
		System.out.println(param2);
		System.out.println(param3);
		System.out.println(param1+param2+param3);
	}
	
	public void calljson(Integer param1 ) {
		
		for (int i = 0; i < param1; i++) {
			
			System.out.println("Hello");
		}
		
	}
	
	public void callException(Exchange exchange) throws CamelCustomException{
		exchange.getIn().setHeader(Exchange.HTTP_RESPONSE_CODE , 400);
		exchange.getIn().setHeader(Exchange.HTTP_RESPONSE_TEXT, "bad Request..........");
		
		System.out.println(exchange.getIn().getHeader(Exchange.HTTP_RESPONSE_CODE));
		System.out.println(exchange.getIn().getHeader(Exchange.HTTP_RESPONSE_TEXT));

		throw new CamelCustomException("This is a custom exception");
	}
}
