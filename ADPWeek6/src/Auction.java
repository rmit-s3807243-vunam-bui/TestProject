import java.util.*;
public class Auction extends Sale{
	private String inspectDate;
	public Auction (String id, Property prop, String date, double minPrice, double deposit, String inspectDate) {
		super(id, prop, date, minPrice, deposit);
		this.inspectDate = inspectDate;
	}
	
	public Auction (String id, Property prop, double deposit) {
		super(id, prop, deposit);
		
	}
	
	public Auction (String id, Property prop, String stt) {
		super(id, prop, stt);
	}
	
	public double addBid(Customer c, Offer o, double bid) {
		o.setCID(c.getCID());
		o.setPID(getID());
		o.setVal(bid);
		replies.add(o);
		return o.getVal();
	}
	
	
	
}
