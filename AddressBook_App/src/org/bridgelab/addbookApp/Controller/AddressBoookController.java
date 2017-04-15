package org.bridgelab.addbookApp.Controller;

import java.util.*;
import java.util.Map.Entry;

import org.bridgelab.addbookApp.Service.AdBook;
import org.bridgelab.addbookApp.Service.AddressBook;

public class AddressBoookController {
	Scanner sc = new Scanner(System.in);
	AdBook ab = new AddressBook();

	public void addPerson() {

				ab.addPerson();
	}

	public void createNewAddressBook() {
		int i = 0;
		AddressBook a = new AddressBook();
		a.createNewAddressBook();
		System.out.println("Do you Want to Add More ?");
		System.out.println("1 yes\n2 no");
		int s = sc.nextInt();
		while (i < 10) {
			if (s == 1) {
				a.createNewAddressBook();
				i++;
			} else if (s == 2) {
				System.out.println("You exited thankyou");
				break;
			}
		}
	}

	public void sortByName() {
		AddressBook a = new AddressBook();

	}

	public void sortByZip() {
		AddressBook a = new AddressBook();
	}

	public void delete() {

		ab.deleteByFirstName();
	}
	public void Edit() {

		ab.editDetails();
	}

}
