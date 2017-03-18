package com.bizruntime.resources;

import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;
import com.bizruntime.exception.DataParseException;
import com.bizruntime.exception.DataReadeException;
import com.bizruntime.exception.ResourceNotFoundException;
import com.bizruntime.stocktrade.CSVStockTradeReader;
import com.bizruntime.stocktrade.StockTrade;

@Path("/CSVReader")
public class CSVReadResources {
	
	public static final Logger LOGGER = Logger.getLogger(CSVReadResources.class);
	CSVStockTradeReader reader = new CSVStockTradeReader();
	
	@GET
	@Path("filereader")
	@Produces(MediaType.APPLICATION_JSON)
	public List<StockTrade> getAllProduct() throws ResourceNotFoundException, DataReadeException, DataParseException{
		
		LOGGER.debug("done");
		return reader.readStockTrades();
	}
	@GET
	public String getmsg(){
		return "HEllo world";
	}
	
	@GET
	public String getMessage(){
		return  "hello world";
	}
	
	@POST
	@Path("/maxvolume")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response  getMaxVolume(List<StockTrade> list) throws ResourceNotFoundException, DataReadeException, DataParseException{
		StockTrade trade =  reader.getMaxVolumeTrade(reader.readStockTrades());
		return Response.status(Status.ACCEPTED).entity(trade).build();
		}
	
	@POST
	@Path("/minvolume")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getMinVolume() throws ResourceNotFoundException, DataReadeException, DataParseException{
		StockTrade trade =  reader.getMinVolumeTrade(reader.readStockTrades());
		return Response.status(Status.ACCEPTED).entity(trade).build();
	}
	@POST
	@Path("/map")

	@Produces(MediaType.APPLICATION_JSON)
	public Response getDailyTrade() throws ResourceNotFoundException, DataReadeException, DataParseException{
		Map<Date,Double> map = reader.getDailyTradingDifferential(reader.readStockTrades());
		StringBuilder stringBuilder = new StringBuilder("<");
		stringBuilder.append("root");
		stringBuilder.append(">");
		
	
		for (Map.Entry<Date, Double> entry : map.entrySet()) {
			stringBuilder.append("<");
			stringBuilder.append(entry.getKey());
			stringBuilder.append(">");
			
			stringBuilder.append(entry.getValue());
			stringBuilder.append("</");
			stringBuilder.append(entry.getKey());
			stringBuilder.append(">");
			
		}
		return Response.status(Status.CREATED).entity(map).build();
	}
	
	@POST
	@Path("/mapdata")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getMap() throws ResourceNotFoundException, DataReadeException, DataParseException{
		Map<Date,Double> map = reader.getDailyTradingDifferential(reader.readStockTrades());
		StockTrade stockTrade = new StockTrade();
		return Response.status(Status.OK).entity(map).build();
	}
}
