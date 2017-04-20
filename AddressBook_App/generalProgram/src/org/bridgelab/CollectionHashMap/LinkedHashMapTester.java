package org.bridgelab.CollectionHashMap;

import java.util.LinkedHashMap;

public class LinkedHashMapTester {
	public static void main(String[] args) {
		LinkedHashMap<Integer, TicketBooking> linkedHashMap=new LinkedHashMap<Integer, TicketBooking>();
		linkedHashMap.put(1, new TicketBooking(1, "manoj", "singh", "delhi", "ranchi"));
		linkedHashMap.put(2, new TicketBooking(1, "ashok", "singh", "delhi", "ranchi"));
		linkedHashMap.put(3, new TicketBooking(1, "affa", "singh", "delhi", "ranchi"));
		linkedHashMap.put(4, new TicketBooking(1, "kkkkk", "singh", "delhi", "ranchi"));
		linkedHashMap.put(5, new TicketBooking(1, "kkkkkiiii", "singh", "delhi", "ranchi"));
		linkedHashMap.put(6, new TicketBooking(1, "dddd", "singh", "delhi", "ranchi"));
		linkedHashMap.put(7, new TicketBooking(1, "manoj", "singh", "delhi", "ranchi"));
		linkedHashMap.put(8, new TicketBooking(1, "ashok", "singh", "delhi", "ranchi"));
		linkedHashMap.put(9, new TicketBooking(1, "manoj", "singh", "delhi", "ranchi"));
		linkedHashMap.put(10, new TicketBooking(1, "ashok", "singh", "delhi", "ranchi"));
		System.out.println(linkedHashMap);
	}

}
