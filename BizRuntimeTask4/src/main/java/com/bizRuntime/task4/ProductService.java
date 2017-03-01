/**
 * This is a ProductService class which is singleton class.\
 * @version 1.0
 * @since 12-02-2017
 * */
package com.bizRuntime.task4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

public class ProductService {
	/**
	 * Defination and declaration of Constants and objects.
	 */
	public static final Logger LOGGER = Logger.getLogger(ProductService.class);
	List<Product> producttypelist = new ArrayList<>();
	ProductCSVReader product;

	/**
	 * In the constructor getting all the value in the list
	 * 
	 * @throws IOException
	 */
	public ProductService() throws ProductCSVReaderFileNotFoundException, 
			ProductCSVReaderNumberFormateException, IOException {
		product = new ProductCSVReader();
		product.getAllProducts();
	}

	/**
	 * The method getProductForType takking String args and return type os list.
	 * the method is performing matching between argument and list element. In
	 * This Method we are cheching for Object type.
	 * 
	 * @throws IOException
	 */
	public List<Product> getProductForType(String productType)
			throws ProductCSVReaderFileNotFoundException, ProductCSVReaderNumberFormateException,IOException {
		List<Product> list = new ProductCSVReader().getAllProducts();
		LOGGER.info("listD" + list);
		LOGGER.info(productType);
		for (int i = 0; i < list.size(); i++) {
			LOGGER.info(list.get(i).getProductType().equalsIgnoreCase(productType));
			if (list.get(i).getProductType().equalsIgnoreCase(productType)) {
				producttypelist.add(list.get(i));
				LOGGER.info(productType);
			}
		}
		LOGGER.info(producttypelist);

		if (producttypelist instanceof Product) {
			Product productlist = (Product) producttypelist;
			LOGGER.info(productlist);
		}

		return producttypelist;

	}
}
