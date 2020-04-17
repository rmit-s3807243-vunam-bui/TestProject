import java.util.*;
public class Property {
	private String pID, address, stt;
	private double price;
	public Property (String pID, String address, double price) {
		this.pID = pID;
		this.address = address;
		this.price = price;
	}
	
	public Property(String stt) {
		this.stt  = stt;
	}
	
	public String getStt() {
		return stt;
	}
	
	public void setStt(String s) {
		this.stt = s;
	}
	
	
	public double getPrice() {
		return price;
	}
	
	
}
