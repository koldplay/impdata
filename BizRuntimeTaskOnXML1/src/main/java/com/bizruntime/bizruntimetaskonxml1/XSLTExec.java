package com.bizruntime.bizruntimetaskonxml1;

import java.io.File;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.apache.log4j.Logger;

public class XSLTExec {
	public static final Logger LOGGER = Logger.getLogger(XSLTExec.class);
	
	public void convertor() {


		// try with resources
		try {
			ClassLoader cl = XSLTExec.class.getClassLoader();
			File xslFile = new File(cl.getResource("WorkOrder.xsl").getFile());
			File xmlFileIn = new File(cl.getResource("WorkOrder.xml").getFile());
			File xmlFileOut = new File("WorkOrderoutput.xml");

			// Instantiate a transformer factory
			TransformerFactory tFactory = TransformerFactory.newInstance();

			// Use the TransformerFactory to process the stylesheet source and
			// produce a Transformer
			StreamSource styleSource = new StreamSource(xslFile);
			Transformer transformer = tFactory.newTransformer(styleSource);

			// Use the transformer and perform the transformation
			StreamSource xmlSource = new StreamSource(xmlFileIn);
			StreamResult result = new StreamResult(xmlFileOut);
			transformer.transform(xmlSource, result);
		} catch (TransformerException e) {
			LOGGER.warn("unable to transform");
		}
	}
}

