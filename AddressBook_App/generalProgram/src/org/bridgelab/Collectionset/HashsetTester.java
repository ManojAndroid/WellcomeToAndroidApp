package org.bridgelab.Collectionset;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetTester {
	public static void main(String[] args) {
		HashSet<TicketBooking> hashSet = new HashSet<TicketBooking>();
		hashSet.add(new TicketBooking(1, "manoj", "singh", "mumbai", "delhi"));
		hashSet.add(new TicketBooking(1, "manoj", "singh", "mumbai", "delhi"));
		hashSet.add(new TicketBooking(2, "akash", "singh", "mumbai", "ranchi"));
		hashSet.add(new TicketBooking(3, "vijay", "singh", "mumbai", "ranchi"));
		hashSet.add(new TicketBooking(4, "aayush", "singh", "mumbai", "ranchi"));
		hashSet.add(new TicketBooking(5, "rayan", "singh", "mumbai", "ranchi"));
		Iterator<TicketBooking> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
