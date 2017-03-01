
package com.bizruntime;

import java.util.Comparator;
import java.util.Date;

public class StockTrade 
{
		String Security;
		Date Date;
		Double Open,High,Low,Close,Volume,Adj_Class;

		public StockTrade()
		{
			
		}
		public StockTrade(String Security,Date Date,Double Open ,Double High,Double Low,Double Close , Double Volume,Double Adj_CLass)
		{
			this.Security = Security;
			this.Date = Date;
			this.Open = Open;
			this.High = High;
			this.Low = Low;
			this.Close = Close;
			this.Volume = Volume;
			this.Adj_Class = Adj_CLass;
		}
		@Override
		public String toString() 
		{
			return "("+Security+","+Date+","+Open+","+High+","+Low+","+Close+","+Volume+","+Adj_Class+")";
		}
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
		public Double getAdj_Class() {
			return Adj_Class;
		}
		public void setAdj_Class(Double adj_Class) {
			Adj_Class = adj_Class;
		}
		class arrangerData implements Comparator<StockTrade>
		{
			@Override
			public int compare(StockTrade o1, StockTrade o2) 
			{				
				return o1.getVolume().compareTo(o2.getVolume());
			}
		}		
	}



