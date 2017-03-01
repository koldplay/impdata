/*
 * This class which is used setting and getting data.
 * Here we are intializing all the data.
 * In this class having method which compare and sends data to its caller.
 *  
 * 
 * @version 1.0
 * @since 06/02/2017
 * */


package com.bizruntime.stocktradetask2;
//All the imported packages
import java.util.Comparator;
import java.util.Date;


public class StockTrade {
	//All initialization here. 
	
	/*
	 * @param Security
	 * @param Date
	 * @param Open
	 * @param High
	 * @param Low
	 * @param Close
	 * @param Adj_Class
	 * @param Quantity
	 * */
	
	private String Security;
	private Date Date;
	private Double Open,High,Low,Close,Adj_Class;
	private int quantity;
	
	/*
	 * Here all the data is getting through toString method
	 * */
	public String toString() 
	{
		return "("+Security+","+Date+","+Open+","+High+","+Low+","+Close+","+","+Adj_Class+","+quantity+")";
	}
	
	/*
	 * Here all the getter and setter is implemented.
	 * 
	 * */
	public String getSecurity() {
		return Security;
	}
	public void setSecurity(String security) {
		Security = security;
	}
	public Date getDate() {
		return Date;
	}
	public void setDate(Date date) {
		Date = date;
	}
	public Double getOpen() {
		return Open;
	}
	public void setOpen(Double open) {
		Open = open;
	}
	public Double getHigh() {
		return High;
	}
	public void setHigh(Double high) {
		High = high;
	}
	public Double getLow() {
		return Low;
	}
	public void setLow(Double low) {
		Low = low;
	}
	public Double getClose() {
		return Close;
	}
	public void setClose(Double close) {
		Close = close;
	}
	
	public Double getAdj_Class() {
		return Adj_Class;
	}
	public void setAdj_Class(Double adj_Class) {
		Adj_Class = adj_Class;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getQuantity() {
		return quantity;
	}
	
	// This is inner class which is compareing data through comparator interface.
	class arrangerData implements Comparator<StockTrade>
	{
		
		public int compare(StockTrade o1, StockTrade o2) 
		{				
			return	Integer.compare(o1.getQuantity(), o2.getQuantity());			
		}
	}		
}





