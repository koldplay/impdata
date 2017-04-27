package cmo.bizruntime.restletdatareading;

public class Addition {

	private int firstdata;
	private int seconddata;
	
	public int getFirstdata() {
		return firstdata;
	}
	public void setFirstdata(int firstdata) {
		this.firstdata = firstdata;
	}
	public int getSeconddata() {
		return seconddata;
	}
	public void setSeconddata(int seconddata) {
		this.seconddata = seconddata;
	}
	
	public Addition(int firstdata, int seconddata) {
		super();
		this.firstdata = firstdata;
		this.seconddata = seconddata;
	}
	
	public Addition() {
		
	}
	@Override
	public String toString() {
		return "Addition [firstdata=" + firstdata + ", seconddata=" + seconddata + "]";
	}

	
	
}
