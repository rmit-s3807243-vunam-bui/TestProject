import java.util.*;
public class Customer {
	private String cID, name, suburb;
	public Customer(String cID, String name, String suburb) {
		this.cID = cID;
		this.name = name;
		this.suburb = suburb;
	}
	
	public String getCID () {
		return cID;
	}
}
