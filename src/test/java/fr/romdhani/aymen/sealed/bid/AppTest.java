package fr.romdhani.aymen.sealed.bid;

import fr.romdhani.aymen.sealed.bid.model.Bid;
import fr.romdhani.aymen.sealed.bid.model.Buyer;
import fr.romdhani.aymen.sealed.bid.model.ObjectToSale;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 * 
 * @author Aromdhani
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

		// Set the object to sale
		ObjectToSale objectToSale = new ObjectToSale(100D);
		assertTrue(objectToSale != null);
		System.out.println(objectToSale.toString());

		// Auction
		Auction auction = new Auction(objectToSale);
		// Set the potential buyers of an auction
		auction.addBuyer(A);
		auction.addBuyer(B);
		auction.addBuyer(C);
		auction.addBuyer(C);
		auction.addBuyer(E);
		//
		assertTrue(auction.getPotentialBuyers().size() == 5);
		System.out.println(auction.dispalyUsers());
		
		// Buyer A
		Bid bid110 = new Bid(110D);
		A.place(bid110);
		auction.acquire();

		Bid bid130 = new Bid(130D);
		A.place(bid130);
		auction.acquire();
		// Buyer B
		
		// Buyer C
		Bid bid125 = new Bid(125D);
		C.place(bid125);
		auction.acquire();
		
		// Buyer D
		Bid bid105 = new Bid(105D);
		D.place(bid105);
		auction.acquire();

		Bid bid115 = new Bid(115D);
		D.place(bid115);
		auction.acquire();

		Bid bid90 = new Bid(90D);
		D.place(bid90);
		auction.acquire();
		
		// Buyer E
		Bid bid132 = new Bid(132D);
		E.place(bid132);
		auction.acquire();

		Bid bid135 = new Bid(135D);
		E.place(bid135);
		auction.acquire();

		Bid bid140 = new Bid(140D);
		D.place(bid140);
		auction.acquire();

		System.out.println(auction.dispalyResult());
	}
}
