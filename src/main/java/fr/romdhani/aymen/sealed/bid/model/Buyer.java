package fr.romdhani.aymen.sealed.bid.model;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * This class represents a buyer.
 * 
 * @author Aromdhani
 *
 */
public final class Buyer {
	private Long id;
	private String name;
	private Double maxPlacedValue=0D;
	private List<Bid> placedBids = new ArrayList<Bid>();
	private List<ObjectToSale> purchasedObjects = new ArrayList<ObjectToSale>();

	/**
	 * The default constructor
	 */
	public Buyer() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 *            the buyer name
	 */
	public Buyer(String name) {
		super();
		this.name = name;
	}

	/**
	 * @param id
	 *            the id of this user
	 * @param name
	 *            the user name
	 */
	public Buyer(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	/**
	 * @return the id
	 */
	public final Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public final void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public final String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public final void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the maxPlacedValue
	 */
	public final Double getMaxPlacedValue() {
		return maxPlacedValue;
	}

	/**
	 * @param maxPlacedValue
	 *            the maxPlacedValue to set
	 */
	public final void setMaxPlacedValue(Double maxPlacedValue) {
		this.maxPlacedValue = maxPlacedValue;
	}

	/**
	 * @return the placedBids
	 */
	public final List<Bid> getPlacedBids() {
		return placedBids;
	}

	/**
	 * @param placedBids
	 *            the placedBids to set
	 */
	public final void setPlacedBids(List<Bid> placedBids) {
		this.placedBids = placedBids;
	}

	/**
	 * @return the purchasedObjects
	 */
	public final List<ObjectToSale> getPurchasedObjects() {
		return purchasedObjects;
	}

	/**
	 * @param purchasedObjects
	 *            the purchasedObjects to set
	 */
	public final void setPurchasedObjects(List<ObjectToSale> purchasedObjects) {
		this.purchasedObjects = purchasedObjects;
	}

	/**
	 * Initialize values for another potential auction.
	 * 
	 */
	public void initialize() {
		maxPlacedValue = 0D;
		placedBids.clear();
	}

	/**
	 * Fetch the max value of bids placed by this user.
	 * 
	 */
	private void computeMaxPlacedBid() {
		for (Bid bid : placedBids) {
			if (bid.getValue() > maxPlacedValue) {
				maxPlacedValue = bid.getValue();
			}
		}
	}

	/**
	 * Place a bid and compute the max
	 * 
	 * @param bidConsumer
	 *            consumer
	 */
	public void place(Bid bid) {
		placedBids.add(bid);
		computeMaxPlacedBid();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Buyer [name=" + name + "]";
	}

}
