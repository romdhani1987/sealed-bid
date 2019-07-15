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
	private Double winningPrice = 0D;
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
		// The buyer winning the auction is the one with the highest bid above
		// or equal to the reserve price.
		assert !potentialBuyers.isEmpty() : "The potential buyers must not be empty!";
		Double maxPlacedValue = 0D;
		Buyer winnerBuyer = null;
		Boolean isWinnerFound = false;
		for (Buyer buyer : potentialBuyers) {
			if (buyer.getMaxPlacedValue() > maxPlacedValue) {
				maxPlacedValue = buyer.getMaxPlacedValue();
				winnerBuyer = buyer;
			}
		}
		if (maxPlacedValue >= object.getReservedPrice()) {
			winner = winnerBuyer;
			object.setOwner(winner);
			isWinnerFound = true;
		}
		// The winning price is the highest bid price from a non-winning buyer
		// above the reserve price (or the reserve price if none applies)
		if (isWinnerFound) {
			List<Buyer> tempBuyers = new ArrayList<Buyer>(potentialBuyers);
			tempBuyers.remove(winner);
			Double winningPriceValue = 0D;
			for (Buyer buyer : tempBuyers) {
				if (buyer.getMaxPlacedValue() > winningPriceValue) {
					winningPriceValue = buyer.getMaxPlacedValue();
				}
			}
			if (winningPriceValue >= object.getReservedPrice()) {
				winningPrice = winningPriceValue;
			}
		}
	}

	/**
	 * Displays the potential buyers
	 * 
	 * @return the potential buyers
	 */
	public String dispalyUsers() {
		return "The potential buyers= " + this.potentialBuyers;
	}

	/**
	 * Displays the auction result
	 * 
	 * @return the auction result.
	 */
	public String dispalyResult() {
		if (winner != null)
			return "The buyer " + this.winner.getName() + " wins the auction at the price of " + this.winningPrice;
		else
			return "No winner were found.";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Auction [object=" + object + ", winner=" + winner + ", winningPrice=" + winningPrice
				+ ", potentialBuyers=" + potentialBuyers + "]";
	}

	

}
