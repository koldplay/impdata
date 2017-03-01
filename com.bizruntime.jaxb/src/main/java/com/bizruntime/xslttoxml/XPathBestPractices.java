package com.bizruntime.xslttoxml;

import java.io.FileInputStream;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XPathBestPractices {
	
	public static void main(String[] args) {
		DocumentBuilderFactory doFactory = DocumentBuilderFactory.newInstance();
		
		DocumentBuilder builder = null;
		try {
			builder = doFactory.newDocumentBuilder();
			Document document = builder.parse(new FileInputStream("inventory.xml"));
			XPath path = XPathFactory.newInstance().newXPath();
			
			String expr = null;
			
			expr = "couny(//computer)";
			Number number = (Number) path.compile(expr).evaluate(document, XPathConstants.NUMBER);
			System.out.println("1. There are " + number +" computers in the inventory.");
			outputSeparator();
			
			
			expr = "//vender[@name]/@name";
			NodeList resultNode =(NodeList) path.compile(expr).evaluate(document, XPathConstants.NODESET);
			if (resultNode != null) {
				int venderlist = resultNode.getLength();
				System.out.println(venderlist);
				for (int i = 0; i < venderlist; i++) {
					Node venderNode = resultNode.item(i);
					String nodename = venderNode.getNodeValue();
					System.out.println(nodename);
				}
				
			}
			
			
			
			Element element = document.getDocumentElement();
			NodeList nodeList = element.getElementsByTagName("computer");
			if (nodeList!= null && nodeList.getLength() >0) {
				for (int i = 0; i < nodeList.getLength(); i++) {
					Node node = nodeList.item(i);
					if (node.getNodeType() == Node.ELEMENT_NODE) {
						Element element2 = (Element) node;
						displayNode(element2 , "model","Model        :");
						displayNode(element2 , "os","Operating System        :");
						displayNode(element2 , "ram","RAM        :");
						displayNode(element2 , "cpu","Processer        :");
						displayNode(element2 , "price","Price        :");
					}
				}
			}
			
			
		} catch (SAXException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}catch (ParserConfigurationException e) {
			e.printStackTrace();
		}catch (XPathExpressionException e) {
			e.printStackTrace();
		}
		
	}

	private static void displayNode(Element element2, String string, String string2) {
		NodeList nodeList = element2.getElementsByTagName(string);
		System.out.println(string2+nodeList.item(0).getChildNodes().item(0).getNodeValue());
		
	}

	private static void outputSeparator() {
		System.out.println("=++=+==+=+==+=+=");
		
	}
}	
