package org.bridgelab.addbookApp.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import org.bridgelab.addbookApp.Model.Person;

public class AddressBook implements AdBook {

	Scanner sc = new Scanner(System.in);
	HashMap<String, LinkedList<Person>> m = new HashMap<String, LinkedList<Person>>();
	LinkedList<Person> link = new LinkedList<Person>();

	String key = "friendAddress";

	public void addPerson() {
		Person p = new Person();

		System.out.println("Enter FirstName");
		String firstName = sc.next();
		p.setFirstName(firstName);
		System.out.println("Enter lastNmae");
		String lastNmae = sc.next();
		p.setLastNmae(lastNmae);
		System.out.println("Ente address");
		String address = sc.next();
		p.setAddress(address);
		System.out.println("Enter city");
		String city = sc.next();
		p.setCity(city);
		System.out.println("Enter state");
		String state = sc.next();
		p.setState(state);
		System.out.println("Enter zipCode");
		int zipcode = sc.nextInt();
		p.setZipcode(zipcode);
		System.out.println("Enter phoneNumber");
		String phoneNumber = sc.next();
		p.setPhoneNumber(phoneNumber);

		link.add(p);
		m.put(key, link);

		display();

	}

	public void createNewAddressBook() {

		System.out.println("Enter The New AddressBook Name");
		String key = sc.next();
		System.out.println("Your New Addressbook is creategetfirstName()d  By name   :" + key);
		System.out.println("Do You Want to  Add " + key + " Deteails \n1:Yes\n2:no");
		int str = sc.nextInt();
		if (str == 1) {
			System.out.println("Enter FirstName");
			String firstName = sc.next();
			System.out.println("Enter lastNmae");
			String lastNmae = sc.next(firstName);
			System.out.println("Ente address");
			String address = sc.next();
			System.out.println("Enter friendAddresscity");
			String city = sc.next();
			System.out.println("Enter state");
			String state = sc.next();
			System.out.println("Enter zipCode");
			String zipcode = sc.next();
			System.out.println("Enter phoneNumber");
			String phoneNumber = sc.next();
			Person pad = new Person();

			System.out.println(pad);
			link.add(pad);
			m.put(key, link);

			for (Entry<String, LinkedList<Person>> entry : m.entrySet()) {
				System.out.println("Sucessfully data addeded into :" + entry.getKey());
				// System.out.println("Values = " + entry.getValue());
				display();
			}
		}
	}

	public void sortByZip() {

	}

	public void sortByName()
	{
		  Map<String, String> treeMap = new HashMap<String, String>((Map<? extends String, ? extends String>) m.get(key));
	        display();
	}

	public void deleteByFirstName() {
		System.out.println("Do you Want to Delete DatA \nYES Enter:1\nNOT Enter:2");
		int n = sc.nextInt();
		if (n == 1) {
			System.out.println("enter  person Firstnamename");
			String name = sc.next();

			for (int i = 0; i < link.size(); i++) {
				String nam = m.get(key).get(i).getFirstName();
				System.out.println(nam);
				if (nam.equalsIgnoreCase(name)) {
					link.remove(m.get(key).get(i));
					display();
					SyeMap);()stem.out.println(name + "  details is sucessfully deleted");
					return;
				} else {
					System.out.println("not data found by this" + name);
				}
			}

		}
	}

	public void display() {
		System.out.println("firstName\tlastNmae\taddress \tcity  \tstate  \tzipcode  \tphoneNumber");
		for (Entry<String, LinkedList<Person>> entry : m.entrySet()) {
			LinkedList<Person> value = entry.getValue();
			for (Person s : value) {
				System.out.println(s);
			}
		}
	}
	
	public void editDetails()
	{
		System.out.println("Enter the name of person whose details you want to edit!!!");
			String name = sc.next();
			
			for (int i = 0; i < link.size(); i++) {
				String nam = m.get(key).get(i).getFirstName();
				if (nam.equals(name)) 
				{
					int ch;
					do
					{
						System.out.println("1 :firstname  \n2 :lastName \n3 :address \n4 :city\n5 :state\n6 :zipcode\n7 :phoneNumber\n8: Exit");
						ch=sc.nextInt();
						switch(ch)
						{
						case 1:System.out.println("enter new firstname");
						 String fname=sc.next();
						 link.get(i).setFirstName(fname);
						 break;
						case 2:System.out.println("enter new lastname");
						 String lname=sc.next();
						 link.get(i).setLastNmae(lname);;
						 break;
						case 3:System.out.println("enter new address");
						 String add=sc.next();
						 link.get(i).setAddress(add);
						 break;
						case 4:System.out.println("enter new city");
						 String city=sc.next();
						 link.get(i).setCity(city);
						 break;
						case 5:System.out.println("enter new state");
						 String st=sc.next();
						 link.get(i).setState(st);
						 break;case 6:System.out.println("enter new zipcode");
						 int zp=sc.nextInt();
						 link.get(i).setZipcode(zp);
						 break;case 7:System.out.println("enter new phonenumbar");
						 String pnumber=sc.next();
						 link.get(i).setPhoneNumber(pnumber);
						 break;
						 default:
						 
						}
					}
					while(ch!=8);
				} 
				display();
				
			}
		
	}

}
