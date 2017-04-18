package org.bridgelab.Collection;

public class TicketBooking implements Comparable<TicketBooking> {
	int id;
	String firstname;
	String lastname;
	String source;
	String destination;

	public TicketBooking(int id, String firstname, String lastname, String source, String destination) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.source = source;
		this.destination = destination;
	}

	public String toString() {
		return "id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", source=" + source
				+ ", destination=" + destination + "";
	}

	public int compareTo(TicketBooking o) {
		if (id > o.id) {
			return 1;
		} else if (id < o.id) {
			return -1;
		} else {
			return 0;
		}
	}
}