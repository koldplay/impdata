package com.bizruntime;

import java.io.StringWriter;

import org.codehaus.jettison.json.JSONException;
import org.json.simple.JSONObject;


public class JsonEncodeDemo {
	public static void main(String[] args) throws JSONException {
		JSONObject object = new JSONObject();
		
		object.put("name", "foo");
		object.put("num", new Integer(100));
		object.put("balance", new Double(2.5));
		
		StringWriter stringWriter = new StringWriter();
		
	}
}
