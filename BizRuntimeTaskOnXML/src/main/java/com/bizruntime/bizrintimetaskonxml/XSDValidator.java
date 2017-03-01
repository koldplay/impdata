package com.bizruntime.bizrintimetaskonxml;

import java.io.File;
import java.io.IOException;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.apache.log4j.Logger;
import org.xml.sax.SAXException;

public class XSDValidator {
	public static final String XML_PATH = "shipment.xml";
	public static final String XSD_PATH = "shipment.xsd";
	public static final Logger LOGGER = Logger.getLogger(XSDValidator.class);
   public static void main(String[] args) {
	   
      if(args.length !=2){
         System.out.println("Usage : XSDValidator <file-name.xsd> <file-name.xml>" );
         LOGGER.info("counting args");
      } else {
         boolean isValid = validateXMLSchema(args[0],args[1]);
         
         if(isValid){
        	 LOGGER.info("valid");
            System.out.println(args[1] + " is valid against " + args[0]);
         } else {
            System.out.println(args[1] + " is not valid against " + args[0]);
         }
      }
   }
   
   public static boolean validateXMLSchema(String xsdPath, String xmlPath){
	   
      try {
         SchemaFactory factory =
            SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
         LOGGER.info(factory);
            Schema schema = factory.newSchema(new File(xsdPath));
         LOGGER.info(schema);   
            Validator validator = schema.newValidator();
         LOGGER.info(validator);   
            validator.validate(new StreamSource(new File(xmlPath)));
      } catch (IOException e){
         System.out.println("Exception: "+e.getMessage());
         return false;
      }catch(SAXException e1){
         e1.printStackTrace();
         return false;
      }
		
      return true;
	
   }
}
