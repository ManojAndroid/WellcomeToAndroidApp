package org.bridgelab.Collectionset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashsetTester {
	public static void main(String[] args) {
		LinkedHashSet<TicketBooking> linkedHashSet = new LinkedHashSet<TicketBooking>();
		linkedHashSet.add(new TicketBooking(1, "manoj", "singh", "mumbai", "delhi"));
		linkedHashSet.add(new TicketBooking(2, "uday", "singh", "mumbai", "ranchi"));
		linkedHashSet.add(new TicketBooking(2, "uday", "singh", "mumbai", "ranchi"));
		linkedHashSet.add(new TicketBooking(3, "akash", "singh", "mumbai", "ranchi"));
		linkedHashSet.add(new TicketBooking(4, "aayush", "singh", "mumbai", "ranchi"));
		linkedHashSet.add(new TicketBooking(5, "rayan", "singh", "mumbai", "ranchi"));
		linkedHashSet.add(new TicketBooking(6, "manoj", "singh", "mumbai", "delhi"));
		Iterator iterator = linkedHashSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}
}
