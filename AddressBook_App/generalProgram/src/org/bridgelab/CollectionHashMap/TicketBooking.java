package org.bridgelab.CollectionHashMap;

public class TicketBooking {

	int id;
	String firstname;
	@Override
	public String toString() {
		return "TicketBooking id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", source=" + source
				+ ", destination=" + destination + "\n";
	}

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
	

}
