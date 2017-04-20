package org.bridgelab.Collectionset;

import java.util.Date;
import java.util.Iterator;
import java.util.TreeSet;

import javax.xml.crypto.Data;

public class TreesetTester {
	public static void main(String[] args) {
		Date d=new Date();
		
		
		
		TreeSet<TicketBooking> treeSet = new TreeSet<TicketBooking>();
		treeSet.add(new TicketBooking(6, "manoj", "singh", "mumbai", "delhi"));
		treeSet.add(new TicketBooking(5, "uday", "singh", "mumbai", "ranchi"));
		treeSet.add(new TicketBooking(4, "akash", "singh", "mumbai", "ranchi"));
		treeSet.add(new TicketBooking(4, "akash", "singh", "mumbai", "ranchi"));
		treeSet.add(new TicketBooking(3, "aayush", "singh", "mumbai", "ranchi"));
		treeSet.add(new TicketBooking(2, "rayan", "singh", "mumbai", "ranchi"));
		treeSet.add(new TicketBooking(1, "manoj", "singh", "mumbai", "delhi"));
		
		Iterator iterator = treeSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println(treeSet.isEmpty());
		System.out.println(treeSet.size());
		System.out.println();
		System.out.println();
		System.out.println("Last Seeen Time :"+d);
	}

}
