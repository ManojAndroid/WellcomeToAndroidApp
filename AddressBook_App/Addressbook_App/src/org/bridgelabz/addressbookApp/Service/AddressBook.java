package org.bridgelabz.addressbookApp.Service;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Scanner;

import org.bridgelabz.addressbookApp.Model.Person;

public class AddressBook implements AddressBookInterface {

	Scanner scanner = new Scanner(System.in);
	HashMap<String, LinkedList<Person>> hashMap = new HashMap<String, LinkedList<Person>>();
	LinkedList<Person> link = new LinkedList<Person>();

	String key = "friendAddress";

	public void addPerson() {
		Person p = new Person();

		System.out.println("Enter FirstName");
		String firstName = scanner.next();
		p.setFirstName(firstName);
		System.out.println("Enter lastNmae");
		String lastNmae = scanner.next();
		p.setLastNmae(lastNmae);
		System.out.println("Ente address");
		String addr = scanner.next();
		p.setAddress(addr);
		System.out.println("Enter city");
		String city = scanner.next();
		p.setCity(city);
		System.out.println("Enter state");
		String state = scanner.next();
		p.setState(state);
		System.out.println("Enter zipCode");
		int zipcode = scanner.nextInt();
		p.setZipcode(zipcode);
		System.out.println("Enter phoneNumber");
		String phoneNumber = scanner.next();
		p.setPhoneNumber(phoneNumber);

		link.add(p);
		hashMap.put(key, link);

		display();

	}

	public void createNewAddressBook() {

		System.out.println("Enter The New AddressBook Name");
		String key = scanner.next();
		System.out.println("Your New Addressbook is creategetfirstName()d  By name   :" + key);
		System.out.println("Do You Want to  Add " + key + " Deteails \n1:Yes\n2:no");
		int str = scanner.nextInt();
		if (str == 1) {
			System.out.println("Enter FirstName");
			String firstName = scanner.next();
			System.out.println("Enter lastNmae");
			String lastNmae = scanner.next(firstName);
			System.out.println("Ente address");
			String address = scanner.next();
			System.out.println("Enter friendAddresscity");
			String city = scanner.next();
			System.out.println("Enter state");
			String state = scanner.next();
			System.out.println("Enter zipCode");
			String zipcode = scanner.next();
			System.out.println("Enter phoneNumber");
			String phoneNumber = scanner.next();
			Person pad = new Person();

			System.out.println(pad);
			link.add(pad);
			hashMap.put(key, link);

			for (Entry<String, LinkedList<Person>> entry : hashMap.entrySet()) {
				System.out.println("Sucessfully data addeded into :" + entry.getKey());
				// System.out.println("Values = " + entry.getValue());
				display();
			}
		}
	}

	public void sortByZip() {
		if (hashMap.containsKey(key)) {
			LinkedList<Person> arraylist = hashMap.get(key);
			Collections.sort(arraylist, Person.sortEntriesZip);

			for (Person str : arraylist) {
				System.out.println(str);
			}
		}
	}

	public void sortByName() {
		if (hashMap.containsKey(key)) {
			LinkedList<Person> arraylist = hashMap.get(key);
			Collections.sort(arraylist, Person.sortEntriesName);

			for (Person str : arraylist) {
				System.out.println(str);
			}
		}

	}

	public void deleteByFirstName() {
		System.out.println("Do you Want to Delete DatA \nYES Enter:1\nNOT Enter:2");
		int n = scanner.nextInt();
		if (n == 1) {
			System.out.println("enter  person Firstnamename");
			String name = scanner.next();

			for (int i = 0; i < link.size(); i++) {
				String nam = hashMap.get(key).get(i).getFirstName();
				System.out.println(nam);
				if (nam.equalsIgnoreCase(name)) {
					link.remove(hashMap.get(key).get(i));
					display();
					System.out.println(name + "  details is sucessfully deleted");
					return;
				} else {
					System.out.println("not data found by this" + name);
				}
			}

		}
	}

	public void display() {
		System.out.println("firstName\tlastNmae\taddress \tcity  \tstate  \tzipcode  \tphoneNumber");
		for (Entry<String, LinkedList<Person>> entry : hashMap.entrySet()) {
			LinkedList<Person> value = entry.getValue();
			for (Person s : value) {
				System.out.println(s);
			}
		}
	}

	public void editDetails() {
		System.out.println("Enter the name of person whose details you want to edit!!!");
		String name = scanner.next();

		for (int i = 0; i < link.size(); i++) {
			String nam = hashMap.get(key).get(i).getFirstName();
			if (nam.equals(name)) {
				int ch;
				do {
					System.out.println(
							"1 :firstname  \n2 :lastName \n3 :address \n4 :city\n5 :state\n6 :zipcode\n7 :phoneNumber\n8: Exit");
					ch = scanner.nextInt();
					switch (ch) {
					case 1:
						System.out.println("enter new firstname");
						String fname = scanner.next();
						link.get(i).setFirstName(fname);
						break;
					case 2:
						System.out.println("enter new lastname");
						String lname = scanner.next();
						link.get(i).setLastNmae(lname);
						;
						break;
					case 3:
						System.out.println("enter new address");
						String add = scanner.next();
						link.get(i).setAddress(add);
						break;
					case 4:
						System.out.println("enter new city");
						String city = scanner.next();
						link.get(i).setCity(city);
						break;
					case 5:
						System.out.println("enter new state");
						String st = scanner.next();
						link.get(i).setState(st);
						break;
					case 6:
						System.out.println("enter nmew zipcode");
						int zp = scanner.nextInt();
						link.get(i).setZipcode(zp);
						break;
					case 7:
						System.out.println("enter new phonenumbar");
						String pnumber = scanner.next();
						link.get(i).setPhoneNumber(pnumber);
						break;
					default:

					}
				} while (ch != 8);
			}
			display();

		}

	}

}
