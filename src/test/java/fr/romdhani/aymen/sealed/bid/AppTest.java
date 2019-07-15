package fr.romdhani.aymen.sealed.bid;

import fr.romdhani.aymen.sealed.bid.model.Buyer;
import fr.romdhani.aymen.sealed.bid.model.ObjectToSale;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public AppTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(AppTest.class);
	}

	/**
	 * Sealed-bid test
	 */
	public void testSealedBidAuction() {
		// The potential buyers
		Buyer A = new Buyer("A");
		assertTrue(A != null);
		System.out.println(A.toString() + " is a potential buyer!");
		Buyer B = new Buyer("B");
		assertTrue(B != null);
		System.out.println(B.toString() + " is a potential buyer!");
		Buyer C = new Buyer("C");
		assertTrue(C != null);
		System.out.println(C.toString() + " is a potential buyer!");
		Buyer D = new Buyer("D");
		assertTrue(D != null);
		System.out.println(D.toString() + " is a potential buyer!");
		Buyer E = new Buyer("E");
		assertTrue(E != null);
		System.out.println(E.toString() + " is a potential buyer!");
		// The object to sale
		ObjectToSale objectToSale = new ObjectToSale(100D);
		assertTrue(objectToSale != null);
		System.out.println(objectToSale.toString());
		// Auction
		Auction auction = new Auction(objectToSale);
		// Set the potential buyer to the auction
		auction.addBuyer(A);
		auction.addBuyer(B);
		auction.addBuyer(C);
		auction.addBuyer(C);
		auction.addBuyer(E);
		System.out.println(auction.toString());
		
	}
}
