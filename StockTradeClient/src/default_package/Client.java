package default_package;

public class Client {
	
	public static void main(String[] args) throws StockTradeInValidFormatException_Exception {
		CSVStockTradeReaderService service = new CSVStockTradeReaderService();
		CSVStockTradeReader reader = service.getCSVStockTradeReaderPort();
		System.out.println(reader.readStockTrades().get(0).getSecurity());
		for (int i = 0; i < reader.readStockTrades().size(); i++) {
			System.out.println(reader.readStockTrades().get(i).getSecurity());
			System.out.println(reader.readStockTrades().get(i).getDate());
			System.out.println(reader.readStockTrades().get(i).getOpen());
			System.out.println(reader.readStockTrades().get(i).getHigh());
			System.out.println(reader.readStockTrades().get(i).getLow());
			System.out.println(reader.readStockTrades().get(i).getClose());
			System.out.println(reader.readStockTrades().get(i).getVolume());
			System.out.println(reader.readStockTrades().get(i).getAdjClose());
		}
	}
}
