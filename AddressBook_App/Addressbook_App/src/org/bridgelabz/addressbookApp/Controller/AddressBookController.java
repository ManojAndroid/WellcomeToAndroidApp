package org.bridgelabz.addressbookApp.Controller;

import org.bridgelabz.addressbookApp.Service.AddressBook;
import org.bridgelabz.addressbookApp.Service.AddressBookInterface;

public class AddressBookController {

	AddressBookInterface addressBook = new AddressBook();

	public void addPerson() {

		addressBook.addPerson();
	}

	public void createNewAddressBook() {
		addressBook.createNewAddressBook();
	}

	public void sortByName() {
		addressBook.sortByName();

	}

	public void sortByZip() {
		addressBook.sortByZip();
	}

	public void delete() {

		addressBook.deleteByFirstName();
	}

	public void Edit() {

		addressBook.editDetails();
	}

	public void display() {

		addressBook.display();
	}

}
