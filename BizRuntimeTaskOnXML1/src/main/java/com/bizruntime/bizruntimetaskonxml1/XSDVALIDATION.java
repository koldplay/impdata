package com.bizruntime.bizruntimetaskonxml1;

import java.io.File;
import java.io.IOException;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.apache.log4j.Logger;
import org.xml.sax.SAXException;

public class XSDVALIDATION {

	private static final Logger LOGGER = Logger.getLogger(XSDVALIDATION.class);
	   public void validator() {
			ClassLoader classLoader = XSDVALIDATION.class.getClassLoader();
			File inputxsdFile = new File(classLoader.getResource("WorkOrder.xsd").getFile());
			File inputxmlFile = new File(classLoader.getResource("WorkOrder.xml").getFile());
				if (inputxmlFile == null || inputxsdFile == null) {
					return;
				}else {
					LOGGER.info("Usage : XSDValidator <file-name.xsd> <file-name.xml>");
			         boolean isValid = validateXMLSchema(inputxsdFile , inputxmlFile);
			         if(isValid){
				            LOGGER.info("WorkOrder.xsd is valid against WorkOrder.xml");
				         } else {
				        	 LOGGER.info("WorkOrder.xsd is not valid against WorkOrder.xml");
				         }
				}		         
		         
		      }
		   
		   
		   public static boolean validateXMLSchema(File xsdPath, File xmlPath){
		      try {
		         SchemaFactory factory =
		            SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		            Schema schema = factory.newSchema(xsdPath);
		            Validator validator = schema.newValidator();
		            validator.validate(new StreamSource(xmlPath));
		      } catch (IOException e){
		         LOGGER.info("Problem Occurring During reading File");
		         return false;
		      }catch(SAXException e1){
		         LOGGER.warn("unable to pareseing ");
		         return false;
		      }
				
		      return true;
			
		   }
	
}
