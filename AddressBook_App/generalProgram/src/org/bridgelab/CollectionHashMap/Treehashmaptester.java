package org.bridgelab.CollectionHashMap;

import java.util.TreeMap;

public class Treehashmaptester {
	public static void main(String[] args) {
		TreeMap<Integer, TicketBooking> treeMap=new TreeMap<Integer, TicketBooking>();
		treeMap.put(3, new TicketBooking(1, "manoj", "singh", "delhi", "ranchi"));
		treeMap.put(2, new TicketBooking(1, "ashok", "singh", "delhi", "ranchi"));
		treeMap.put(1, new TicketBooking(1, "affa", "singh", "delhi", "ranchi"));
		treeMap.put(4, new TicketBooking(1, "kkkkk", "singh", "delhi", "ranchi"));
		treeMap.put(5, new TicketBooking(1, "kkkkkiiii", "singh", "delhi", "ranchi"));
		treeMap.put(8, new TicketBooking(1, "dddd", "singh", "delhi", "ranchi"));
		treeMap.put(6, new TicketBooking(1, "manoj", "singh", "delhi", "ranchi"));
		treeMap.put(7, new TicketBooking(1, "ashok", "singh", "delhi", "ranchi"));
		treeMap.put(9, new TicketBooking(1, "manoj", "singh", "delhi", "ranchi"));
		treeMap.put(10, new TicketBooking(1, "ashok", "singh", "delhi", "ranchi"));
		System.out.println(treeMap);
	}
	 

}
