package com.bizruntime.resources;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Date;
import java.util.Map;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;

import com.bizruntime.exception.DataParseException;
import com.bizruntime.exception.DataReadeException;
import com.bizruntime.exception.ResourceNotFoundException;
import com.bizruntime.stocktrade.CSVStockTradeReader;
import com.bizruntime.stocktrade.StockTrade;

public class StocktradeMessageBodyWriter implements MessageBodyWriter<StockTrade>{

	@Override
	public long getSize(StockTrade stockTrade, Class<?> obj, Type type, Annotation[] anot, MediaType mtype) {
		
		return 0;
	}
	@Override
	public boolean isWriteable(Class<?> obj, Type type, Annotation[] anot, MediaType mtype) {
		// TODO Auto-generated method stub
		return obj == StockTrade.class;
	}

	public void writeTo(StockTrade stocktrade, Class<?> obj, Type type, Annotation[] anot, MediaType mtype,
			MultivaluedMap<String , Object> multimap, OutputStream outstream) throws IOException, WebApplicationException {
		Writer writer = new PrintWriter(outstream);
		
		CSVStockTradeReader reader = new CSVStockTradeReader();
		try {
			Map<Date, Double> map = reader.getDailyTradingDifferential(reader.readStockTrades());
			for (Map.Entry<Date, Double> entry : map.entrySet()) {
				writer.append("<"+entry.getKey()+">");
				writer.append(" "+entry.getValue() +" ");
				writer.append("</"+entry.getKey()+">");
			}
			
			
		} catch (ResourceNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DataReadeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DataParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		writer.append("<"+stocktrade.getDate()+">");
//		writer.append(" "+stocktrade.getVolume()+" ");
//		writer.append("</"+stocktrade.getDate()+">");
		
		writer.flush();
		writer.close();
	}


}
