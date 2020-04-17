import java.util.*;
public class SaleAndRental {
	private String id, date, stt;
	private Property prop;
	private double minPrice, deposit;
	ArrayList<Offer> replies = new ArrayList<Offer>();
	public SaleAndRental (String id, Property prop, String date, double minPrice, double deposit) {
		this.id = id;
		this.prop = prop;
		this.date = date;
		this.minPrice = minPrice;
		this.deposit = deposit;
	}
	
	public SaleAndRental (String id, Property prop, double deposit) {
		this.id = id;
		this.prop = prop;
		this.deposit = deposit;
	}
	
	public SaleAndRental (String id, Property prop, String stt) {
		this.id = id;
		this.prop = prop;
		this.stt = stt;
	}
	
	public String getID() {
		return id;
	}
	
	public String getStt() {
		return stt;
	}
	
	public double getDeposit() {
		return deposit;
	}
	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
	
	public double addDeposit(double d) {
		setDeposit(0.1*d);
		return deposit;
	}
	
	public String setStatus(Property p) {
		if (getStt().compareTo("Fail") ==0) {
			p.setStt("OPEN");
		}
		else
			p.setStt("CLOSE");
		return p.getStt();
	}
	
}
