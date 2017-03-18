package com.bizruntime.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import com.bizruntim.exception.DataNotFoundException;
import com.bizruntime.database.DataBaseClass;
import com.bizruntime.model.Message;

public class MessageService {
	
	private Map<Long, Message> messages = DataBaseClass.getMessages();
	
	
	public MessageService() {
		messages.put(1L,new Message(1, "Hello World", "krishna"));
		messages.put(2L, new Message(2, "Hello Jersey", "krishna"));
	}
	
	public List<Message> getAllMessage(){
		
//		Message msg1 = new Message(1, "Hello World", "krishna");
//		Message msg2 = new Message(2, "Hello Jersey", "krishna");
//		List<Message> list = new ArrayList<Message>();
//		list.add(msg1);
//		list.add(msg2);
//		return list;
		return new ArrayList<Message>(messages.values());
	}
	public Message getMessage(long id){
		Message message = messages.get(id);
		if (message == null) {
			throw new DataNotFoundException("Message with id :"+id+"not found");
		}
		return message;
	}
	
	public List<Message> getAllMessagesForYear(int year){
		List<Message> list = new ArrayList<Message>();
		Calendar calendar = Calendar.getInstance();
		for (Message message : messages.values()) {
			calendar.setTime(message.getCreated());
			if (calendar.get(Calendar.YEAR) == year) {
				list.add(message);
			}
		}
		
		return list;
	}
	
	public List<Message> getAllMessagesForPaginated(int start , int size){
		
		ArrayList<Message> list = new ArrayList<Message>(messages.values());
		if (start+size  > list.size())return new ArrayList<Message>(); 
		return list.subList(start, start+size);
		
	}
	
	public Message addMessage(Message message){
		message.setId(messages.size()+1);
		messages.put(message.getId(), message);
		return message;
	}
	public Message updateMessage(Message message){
		if (message.getId() <= 0) {
			return null;
		}
		messages.put(message.getId(), message);
		return message;
	}
	public Message removeMessage(long id){
		return messages.remove(id);
	}
}
