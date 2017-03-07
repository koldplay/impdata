package com.bizruntime.productavailabilityservice;

import java.util.List;

public class Client {
	public static void main(String[] args) {
		Productavailabilityservice_Service service = new Productavailabilityservice_Service();
		Productavailabilityservice product = service.getProductavailabilityserviceSOAPPort();
		List<Product> list = product.getAllProductForUser("U1001");
		System.out.println("done");
	}
}
