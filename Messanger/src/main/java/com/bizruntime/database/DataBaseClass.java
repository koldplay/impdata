package com.bizruntime.database;

import java.util.HashMap;
import java.util.Map;

import com.bizruntime.model.Message;
import com.bizruntime.model.Profile;

public class DataBaseClass {

	private static Map<Long, Message> map = new HashMap<Long, Message>();
	private static Map<Long, Profile> mappro = new HashMap<Long, Profile>();
	
	public static Map<Long, Message> getMessages(){
		return map;
	}
	public static Map<Long, Profile> getProfiles(){
		return mappro;
	}
	
}
