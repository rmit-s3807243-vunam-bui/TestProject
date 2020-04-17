import static org.junit.Assert.*;

import org.junit.Test;

public class TestSaleAndRental {
	Property [] prop = new Property [100];
	Customer [] c = new Customer [100];
	Auction [] auc = new Auction [100];
	Offer [] o = new Offer [100];
	
	@Test
	public void testAddBid() {
		c[0] = new Customer("c001", "John", "Chadstones");
		prop [0]= new Property ("p001", "Collins street", 100);
		auc [0] = new Auction("a001", prop[0], 0.0);
		o [0] = new Offer();
		auc[0].addBid(c[0], o[0], 100);
		assertEquals(100, o[0].getVal(), 0);
	}
	
	@Test
	public void testGetDeposit() {
		prop[1] = new Property("p002", "Swanton Streest", 100000);
		auc [1] = new Auction("a002", prop[1], 0.0);
		double result = auc[1].addDeposit(prop[1].getPrice());
		assertEquals(10000, auc[1].getDeposit(), 0);
	}
	
	@Test
	public void testSetStt1() {
		prop [0] = new Property("OPEN");
		auc [0] = new Auction ("a001", prop[0], "Success");
		String result = auc[0].setStatus(prop[0]);
		assertEquals("CLOSE", result);
	}
	@Test
	public void testSetStt2() {
		prop [0] = new Property("OPEN");
		auc [0] = new Auction ("a001", prop[0], "Fail");
		String result = auc[0].setStatus(prop[0]);
		assertEquals("OPEN", result);
	}
	

}
