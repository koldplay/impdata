/**
 * This is Junit Test class ProductCSVTest.
 * version 1.0
 * since 12-02-2017  
 * */


package com.bizRuntime.task4;


import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;

public class ProductCSVTest {
	
	public final static Logger LOGGER = Logger.getLogger(ProductCSVTest.class);
	@Test
	public void testGetAllProducts() throws ProductCSVReaderFileNotFoundException, ProductCSVReaderNumberFormateException,  IOException{
		ProductCSVReader product = new ProductCSVReader();
		List<Product> list = product.getAllProducts();
		LOGGER.info(list);
	}
	
	
	@Test
	public void testGetProductForType() throws ProductCSVReaderFileNotFoundException, ProductCSVReaderNumberFormateException,IOException{
		ProductService service = new ProductService();
		List<Product> list = service.getProductForType("Laptop");
		LOGGER.info(list);
	}
}



