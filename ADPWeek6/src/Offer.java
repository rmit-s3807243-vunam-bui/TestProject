import java.time.LocalDate;
import java.util.*;

public class Offer {
	private String offerID;
	private Customer cus;
	private Property prop;
	private String status = "Open";
	private double price;
	private LocalDate date;

	public Offer(String offerID, Customer cus, Property prop, double price, LocalDate date, String status) {
		this.offerID = offerID;
		this.cus = cus;
		this.prop = prop;
		this.price = price;
		this.date = date;
		this.status = status;
	}

	public Offer() {

	}

	public String getStatus() {
		return status;
	}

//	public String getPID() {
//		return pID;
//	}

	public void updateStatus(String status) {
		this.status = status;
	}

}
