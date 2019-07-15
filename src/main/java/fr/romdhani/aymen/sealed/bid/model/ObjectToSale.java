package fr.romdhani.aymen.sealed.bid.model;

/**
 * This class represents an object to sale.
 * 
 * @author Aromdhani
 *
 */
public final class ObjectToSale {
	// TODO the reserved price it could be final.
	private Double reservedPrice = null;
	private Buyer owner = null;

	/**
	 * @param reservedPrice
	 *            the reserved price.
	 */
	public ObjectToSale(Double reservedPrice) {
		super();
		this.reservedPrice = reservedPrice;
	}

	/**
	 * @param reservedPrice
	 *            the reserved price
	 * @param owner
	 *            the initial owner of the object
	 */
	public ObjectToSale(Double reservedPrice, Buyer owner) {
		super();
		this.reservedPrice = reservedPrice;
		this.owner = owner;
	}

	/**
	 * @return the reserved price
	 */
	public final Double getReservedPrice() {
		return reservedPrice;
	}

	/**
	 * @param reservedPrice
	 *            the reserved price to set
	 */
	public final void setReservedPrice(Double reservedPrice) {
		this.reservedPrice = reservedPrice;
	}

	/**
	 * @return the owner
	 */
	public final Buyer getOwner() {
		return owner;
	}

	/**
	 * @param owner
	 *            the owner to set
	 */
	public final void setOwner(Buyer owner) {
		this.owner = owner;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ObjectToSale [reservedPrice= " + reservedPrice + ", owner= " + owner + "]";
	}

}
