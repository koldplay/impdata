package com.bizruntime.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.stream.events.Comment;

@XmlRootElement
public class Message {
	
	private long id;
	private String message;
	private String author;
	private Date created;
	private Map<Long, Comment> comment = new HashMap<Long, Comment>() ;
	private List<Link> list = new ArrayList<Link>();
	
	public Message() {
		// TODO Auto-generated constructor stub
	}
	public Message(long id ,String message ,String author) {
		this.id = id;
		this.message = message;
		this.author = author;
		this.created = new Date();
	}
	
	public List<Link> getList() {
		return list;
	}
	public void setList(List<Link> list) {
		this.list = list;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public Date getCreated() {
		return created;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void addLink(String url,String rel){
		Link link = new Link();
		link.setLink(url);
		link.setRel(rel);
		list.add(link);
	}
}
