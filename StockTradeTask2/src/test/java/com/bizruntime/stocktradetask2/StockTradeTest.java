/*
 * It is Junit Test class for StockTradeReader
 * For This test class we are Using 
 * 
 * @version junit - 4.12
 * @since 06/02/2017
 *  
 * */
package com.bizruntime.stocktradetask2;
import java.util.List;

import org.junit.Test;

import com.bizruntime.stocktradetask2.StockTrade;
import com.bizruntime.stocktradetask2.StockTradeFileReaderException;
import com.bizruntime.stocktradetask2.StockTradeInValidFormatException;
import com.bizruntime.stocktradetask2.StockTradeParseException;
import com.bizruntime.stocktradetask2.StockTradeReader;

import junit.framework.TestCase;

public class StockTradeTest extends TestCase {
	
	/*
	 * This Method is for getting maximum value form list.
	 * 
	 * */
	
//	@Test
//	public void testReadStockTrades() throws StockTradeInValidFormatException, StockTradeParseException, StockTradeFileReaderException{
//		StockTradeReader stock = new StockTradeReader();
//		List<StockTrade> list = stock.readStockTrades();
//		assertEquals("(CISCO,Fri Nov 29 00:00:00 IST 2013,21.389999,21.440001,21.200001,21.258555,,19.470892,25043700), (CISCO,Tue Nov 26 00:00:00 IST 2013,21.299999,21.410121,21.080256,21.209999,,19.493424,48629300), (CISCO,Fri Nov 22 00:00:00 IST 2013,21.412599,21.589965,21.309999,21.459999,,19.766331,41105000), (CISCO,Wed Nov 20 00:00:00 IST 2013,21.469999,21.469999,21.219999,21.235225,,19.452566,442997400), (CISCO,Mon Nov 18 00:00:00 IST 2013,21.605692,21.719999,21.200001,21.290001,,19.507544,66008900), (CISCO,Thu Nov 14 00:00:00 IST 2013,20.940001,21.440001,25.485488,21.370001,,19.580846,24255400), (CISCO,Tue Nov 12 00:00:00 IST 2013,23.430126,23.845487,56.555998,23.734887,,21.784326,380128311), (CISCO,Fri Nov 08 00:00:00 IST 2013,23.280001,23.520017,78.659898,23.513306,,21.541679,30884100), (CISCO,Wed Nov 06 00:00:00 IST 2013,23.209999,23.370001,23.800005,23.280001,,21.330936,48257800)", stock.readStockTrades());
//	}
	
	@Test
	public void testGetMaxQuantityTrade() throws StockTradeInValidFormatException, StockTradeParseException, StockTradeFileReaderException{
		StockTradeReader stock = new StockTradeReader();
		List<StockTrade> list = stock.readStockTrades();
		assertEquals(442997400, stock.getMaxQuantityTrade(list).getQuantity());
	}
	/*
	 *This Method is for getting minimum value from list 
	 *
	 * */
	@Test
	public void testGetMinQuantityTrade() throws StockTradeInValidFormatException ,StockTradeParseException, StockTradeFileReaderException{
		StockTradeReader stock = new StockTradeReader();
		List<StockTrade> list = stock.readStockTrades();
		assertEquals(24255400, stock.getMinQuantityTrade(list).getQuantity());
	}
	/*
	 * This method is for getting daily stock trade
	 * 
	 * */
	@Test
	public void testGetDailyTradingDifferential(List<StockTrade> list) throws StockTradeInValidFormatException,StockTradeParseException, StockTradeFileReaderException{
		StockTradeReader stock = new StockTradeReader();
		List<StockTrade> list1 = stock.readStockTrades();
		stock.getDailyTradingDifferential(list1);
		
	}
}

