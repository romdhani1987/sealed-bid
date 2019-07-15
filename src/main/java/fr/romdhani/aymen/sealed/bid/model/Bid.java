package fr.romdhani.aymen.sealed.bid.model;

/**
 * This class represents a bid. The user can place one or more bids.
 * 
 * @author Aromdhani
 *
 */
public final class Bid {
	private Long ref;
	private Double value;

	/**
	 * Default constructor
	 */
	public Bid() {
	}

	/**
	 * 
	 * @param value
	 *            the value of the the bid to set
	 */
	public Bid(Double value) {
		this.value = value;
	}

	/**
	 * 
	 * @param ref
	 *            the reference of the the bid to set
	 * @param value
	 *            the value of the the bid to set
	 */
	public Bid(Long ref, Double value) {
		this.value = value;
		this.ref = ref;
	}

	/**
	 * @return the reference of the bid
	 */
	public final Long getRef() {
		return ref;
	}

	/**
	 * @param ref
	 *            the reference to set
	 */
	public final void setRef(Long ref) {
		this.ref = ref;
	}

	/**
	 * @return the value of the bid
	 */
	public final Double getValue() {
		return value;
	}

	/**
	 * @param value
	 *            the value of the bid to set
	 */
	public final void setValue(Double value) {
		this.value = value;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Bid [the value= " + value + "]";
	}

}
