package com.bizruntime.taskondao;

import java.util.Comparator;
import java.util.Date;



public class StockTrade {
	private String Security;
	private Date Date;
	private Double Open;
	private Double High;
	private Double Low;
	private Double Close;
	private Double Volume;
	private Double Adj_Close;

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
	public Double getVolume() {
		return Volume;
	}
	public void setVolume(Double volume) {
		Volume = volume;
	}
	public Double getAdj_Close() {
		return Adj_Close;
	}
	public void setAdj_Close(Double adj_Close) {
		Adj_Close = adj_Close;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "("+Security+","+Date+","+ Open+","+High+","+Low+","+Close+","+Adj_Close+")";
	}
	class arrangerData implements Comparator<StockTrade>
	{
		
		public int compare(StockTrade o1, StockTrade o2) 
		{				
			return o1.getVolume().compareTo(o2.getVolume());
		}
	}

}
