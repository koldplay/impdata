package com.bizruntime.messanger.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

import com.bizruntime.model.Message;
import com.bizruntime.service.MessageService;

@Path("/messages")
public class MessageResources {
	
	MessageService service = new MessageService();
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message>getAllMessage(@QueryParam("year") int year,
									  @QueryParam("start") int start,
									  @QueryParam("size") int size
			){
		if (year > 0) {
			return service.getAllMessagesForYear(year);
		}if (size >=0 && start >=0) {
			return service.getAllMessagesForPaginated(start, size);
		}
		
		return service.getAllMessage();	
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON) 
	public Message addMessage(Message message){
		
		return service.addMessage(message);
	}
	
	@GET 
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Message getMessage(@PathParam("messageId") long messageId , @Context UriInfo urinfo ){
		
		Message messagelink =service.getMessage(messageId);
		String uri = getUriForSelf(urinfo, messagelink);
		
		messagelink.addLink(uri, "self");
		return messagelink;
	}

	private String getUriForSelf(UriInfo urinfo, Message messagelink) {
		return urinfo.getAbsolutePathBuilder().path(MessageResources.class).path(Long.toString(messagelink.getId())).build().toString();
	}
	
	
	@PUT
	@Path("/{messageId}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message updateMessage(@PathParam("messageId") long id , Message message){
		message.setId(id);
		
		return service.updateMessage(message);
	}
	@DELETE
	@Path("/{messageId}")	
	@Produces(MediaType.APPLICATION_JSON)
	public void deleteMessage(@PathParam("messageId") long id){
		service.removeMessage(id);
	}
}
