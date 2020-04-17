import java.util.*;
public abstract class Sale {
	private String sID, status;
	private Property prop;
	private Employee emp;
	private int comPercent;
	private Offer off [] = new Offer[100];
	private int offCount;
	public Sale (String sID, Property prop, Employee emp, int comPercent, Offer off[], String status) {
		this.sID = sID;
		this.prop = prop;
		this.emp = emp;
		this.comPercent = comPercent;
		this.off = off;
		this.status = status;
	}
	public void addOffer(Offer off) {
		this.off[offCount] = off;
	}
	//test2
	//test 3123
	public abstract void changeWillingPrice();
	
	public void test() {
		
	}
	
}
