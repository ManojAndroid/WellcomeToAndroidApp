package org.bridgelabz.addressbookApp.Service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import org.bridgelabz.addressbookApp.Model.Person;

public class AddressBook implements AddressBookInterface {

	int numberofaddressbook = 0;
	Map<String, LinkedList<Person>> hashMap = new HashMap<String, LinkedList<Person>>();
	LinkedList<Person> linkedList = new LinkedList<Person>();

	String[] addressbook = new String[100];

	Person person;
	Scanner scanner = new Scanner(System.in);
	static String key = "";

	public void addPerson() {
		fileReade();
		if (numberofaddressbook == 0) {
			System.out.println("There Is No AddressBoook Created,Press 1...Create New AddressBook ");
			int press = scanner.nextInt();

			if (press == 1) {
				createNewAddressBook();

			} else {
			}

		} else {

			for (int select = 0; select < numberofaddressbook; select++) {
				System.out.println(select + " " + addressbook[select]);
			}
			System.out.println(" Select Your Address Book");
			int select = scanner.nextInt();
			key = addressbook[select];
		}

		Person person = new Person();

		System.out.println("Enter FirstName");
		String firstName = scanner.next();
		person.setFirstName(firstName);

		System.out.println("Enter lastNmae");
		String lastNmae = scanner.next();
		person.setLastNmae(lastNmae);

		System.out.println("Ente address");
		String addr = scanner.next();
		person.setAddress(addr);

		System.out.println("Enter city");
		String city = scanner.next();
		person.setCity(city);

		System.out.println("Enter state");
		String state = scanner.next();
		person.setState(state);

		System.out.println("Enter zipCode");
		int zipcode = scanner.nextInt();
		person.setZipcode(zipcode);

		System.out.println("Enter phoneNumber");
		String phoneNumber = scanner.next();
		person.setPhoneNumber(phoneNumber);

		linkedList.add(person);
		hashMap.put(key, linkedList);
		// display();
		System.out.println("Sucessfully data addeded into " + key);
		fileWrite();
	}

	public void fileWrite() {
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("/home/bridgeit/manojjava/mk.txt");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(addressbook);
			objectOutputStream.writeInt(numberofaddressbook);
			objectOutputStream.writeObject(hashMap);
			objectOutputStream.flush();
			objectOutputStream.close();
			fileOutputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void fileReade() {

		try {
			FileInputStream fileInputStream = new FileInputStream("/home/bridgeit/manojjava/mk.txt");
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			addressbook = (String[]) objectInputStream.readObject();
			numberofaddressbook = objectInputStream.readInt();
			hashMap = (HashMap) objectInputStream.readObject();

			objectInputStream.close();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	public void createNewAddressBook() {

		System.out.println("Enter The New Addressbok Name");
		addressbook[numberofaddressbook] = scanner.next();

		hashMap.put(addressbook[numberofaddressbook], new LinkedList<Person>());
		numberofaddressbook++;
		System.out.println("Address Book Created  ");
		fileWrite();

	}

	public void sortByZip() {
		fileReade();
		for (int select = 0; select < numberofaddressbook; select++) {
			System.out.println(select + " " + addressbook[select]);
		}
		System.out.println(" Select Your Address Book");
		int select = scanner.nextInt();
		key = addressbook[select];
		linkedList = hashMap.get(key);

		if (hashMap.containsKey(key)) {
			LinkedList<Person> arraylist = hashMap.get(key);
			Collections.sort(arraylist, Person.sortEntriesZip);

			for (Person str : arraylist) {
				System.out.println(str);
			}
		}
	}

	public void sortByName() {
		fileReade();
		for (int select = 0; select < numberofaddressbook; select++) {
			System.out.println(select + " " + addressbook[select]);
		}
		System.out.println(" Select Your Address Book");
		int select = scanner.nextInt();
		key = addressbook[select];
		if (hashMap.containsKey(key)) {
			LinkedList<Person> arraylist = hashMap.get(key);
			Collections.sort(arraylist, Person.sortEntriesName);

			for (Person str : arraylist) {
				System.out.println(str);
			}
		}
		fileWrite();
		display();

	}

	public void deleteByFirstName() {
		fileReade();
		System.out.println("address book sre");
		System.out.println("Do you Want to Delete DatA \nYES Enter:1\nNOT Enter:2");
		int n = scanner.nextInt();
		if (n == 1) {
			System.out.println("Enter  Person FirstName");
			String name = scanner.next();

			for (int i = 0; i < linkedList.size(); i++) {
				String nam = hashMap.get(key).get(i).getFirstName();
				System.out.println(nam);
				if (nam.equalsIgnoreCase(name)) {
					linkedList.remove(hashMap.get(key).get(i));
					display();
					System.out.println(name + "  Details Is Sucessfully Deleted");
					return;
				} else {
					System.out.println("Not Data Found By This" + name);
				}
			}

		}
	}

	public void display() {
		fileReade();

		System.out.println("Numbers Of Address Book  :");
		for (int select = 0; select < numberofaddressbook; select++) {
			System.out.println(select + " " + addressbook[select]);
		}
		if (numberofaddressbook == 0) {
			System.out.println("no such address book");
		}

		System.out.println("Select Your Address Book");
		int select = scanner.nextInt();
		key = addressbook[select];
		System.out.println(
				"________________________________________________________________________________________________________________________");
		System.out.println(
				"     FirstName  \tLastNmae      \tAddress      \tCity      \tState           \tZipCode         \tPhoneNumber");
		System.out.println(
				"________________________________________________________________________________________________________________________");

		for (Entry<String, LinkedList<Person>> entry : hashMap.entrySet()) {
			LinkedList<Person> value = entry.getValue();
			for (Person s : value) {
				System.out.println(s);
				System.out.println(
						"________________________________________________________________________________________________________________________");
			}
		}
	}

	public void editDetails() {
		System.out.println("Enter The Name Of Person Whose Details You Want To Edit!!!");
		String name = scanner.next();

		for (int i = 0; i < linkedList.size(); i++) {
			String nam = hashMap.get(key).get(i).getFirstName();
			if (nam.equals(name)) {
				int option;
				do {
					System.out.println(
							"1 :Firstname  \n2 :LastName \n3 :Address \n4 :City\n5 :State\n6 :ZipCode\n7 :PhoneNumber\n8: Exit");
					option = scanner.nextInt();
					switch (option) {
					case 1:
						System.out.println("Enter New FirstName");
						String fname = scanner.next();
						linkedList.get(i).setFirstName(fname);
						break;
					case 2:
						System.out.println("Enter New LastName");
						String lname = scanner.next();
						linkedList.get(i).setLastNmae(lname);
						;
						break;
					case 3:
						System.out.println("Enter New Address");
						String address = scanner.next();
						linkedList.get(i).setAddress(address);
						break;
					case 4:
						System.out.println("Enter New City");
						String city = scanner.next();
						linkedList.get(i).setCity(city);
						break;
					case 5:
						System.out.println("Enter New State");
						String state = scanner.next();
						linkedList.get(i).setState(state);
						break;
					case 6:
						System.out.println("Enter New ZipCode");
						int zipCode = scanner.nextInt();
						linkedList.get(i).setZipcode(zipCode);
						break;
					case 7:
						System.out.println("Enter New PhoneNumbar");
						String pnumber = scanner.next();
						linkedList.get(i).setPhoneNumber(pnumber);
						break;
					default:

					}
				} while (option != 8);
			}
			display();

		}

	}

}
