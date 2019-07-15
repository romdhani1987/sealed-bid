package fr.romdhani.aymen.sealed.bid;

import java.util.ArrayList;
import java.util.List;

import fr.romdhani.aymen.sealed.bid.model.Buyer;
import fr.romdhani.aymen.sealed.bid.model.ObjectToSale;

/**
 * This class represents an auction.
 * 
 * @author Aromdhani
 *
 */
public final class Auction {
	private ObjectToSale object = null;
	private Buyer winner = null;
	private List<Buyer> potentialBuyers = new ArrayList<Buyer>();

	/**
	 * Default constructor
	 */
	public Auction() {
		super();

		// TODO Auto-generated constructor stub
	}

	/**
	 * @param object
	 */
	public Auction(ObjectToSale object) {
		super();
		this.object = object;
	}

	/**
	 * @return the object to sale
	 */
	public final ObjectToSale getObject() {
		return object;
	}

	/**
	 * @param object
	 *            the object to set
	 */
	public final void setObject(ObjectToSale object) {
		this.object = object;
	}

	/**
	 * @return the potential buyers
	 */
	public final List<Buyer> getPotentialBuyers() {
		return potentialBuyers;
	}

	/**
	 * @param potentialBuyers
	 *            the potential buyers to set
	 */
	public final void setPotentialBuyers(List<Buyer> potentialBuyers) {
		this.potentialBuyers = potentialBuyers;
	}

	/**
	 * Add a potential buyer to the list of user
	 * 
	 * @param buyer
	 *            the potential buyer to add
	 */
	public void addBuyer(Buyer buyer) {
		potentialBuyers.add(buyer);
	}

	/***
	 * Acquire an object. Compute the winner and the winning price whenever a
	 * buyer place a bid.
	 */
	public void acquire() {
		

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Auction [object=" + object + ", potentialBuyers= " + this.potentialBuyers + "]";
	}

}
