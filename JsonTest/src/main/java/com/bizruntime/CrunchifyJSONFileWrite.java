package com.bizruntime;

import java.io.FileWriter;
import java.io.IOException;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.json.simple.JSONObject;

public class CrunchifyJSONFileWrite {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws JSONException {
		JSONObject object = new JSONObject();
		object.put("Name","Krishna");
		object.put("Author","App Shah" );
		
		JSONArray array = new JSONArray();
		array.put("Compnay: eBay");
		array.put("Compnay: Paypal");
		array.put("Compnay: Google");
		
		object.put("Company List", array);
		
		try(FileWriter fileWriter = new FileWriter("D:\\User\\Data.json")) {
			fileWriter.write(object.toJSONString());
			System.out.println("Done");
			System.out.println(object);
		} catch (IOException e) {
			// TODO: handle exception
		}
	}
}
