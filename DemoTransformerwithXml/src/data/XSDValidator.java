package data;

import java.io.File;
import java.io.IOException;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.SchemaFactory;

import org.xml.sax.SAXException;

public class XSDValidator {
	public static void main(String[] args) {
		boolean flag =  true;
		try {
			validate("channel.xml","channel.xsd");
		} catch (SAXException | IOException e) {
			flag = false;
		}
		System.out.println("xml is valid"+flag);
	}

	public static void validate(String xmlFile ,String xsdFile)throws SAXException , IOException{
		SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_INSTANCE_NS_URI);
		((schemaFactory.newSchema(new File(xsdFile))).newValidator()).validate(new StreamSource(new File(xmlFile)));
	}
}
   