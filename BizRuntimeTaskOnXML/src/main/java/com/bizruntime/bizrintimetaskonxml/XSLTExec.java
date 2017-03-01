package com.bizruntime.bizrintimetaskonxml;

import java.io.FileOutputStream;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.apache.log4j.Logger;

public class XSLTExec {
	public static final Logger LOGGER = Logger.getLogger(XSLTExec.class);
	public static final String XML_PATH = "shipment.xml";
	public static final String XSLT_PATH = "shipment.xsl";
	public static void main(String[] args) {
		LOGGER.info("entered");
		if (args.length<3) {
			System.out.println("usage: XSLTExec XML-file XSLT-stylesheet Output-file");
			return;
		}
		String xml = args[0];
		String xsl = args[1];
		String outputxml = args[2];
		LOGGER.info(xml);
		LOGGER.info(xsl);
		LOGGER.info(outputxml);
		
		try {
			 TransformerFactory tf = TransformerFactory.newInstance();
			 LOGGER.info(tf);
			 Transformer tr = tf.newTransformer(new StreamSource(xsl));
			 tr.transform(new StreamSource(xml),new StreamResult(new FileOutputStream(outputxml)));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
