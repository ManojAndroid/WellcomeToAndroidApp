package org.bridgelabz.addressbookApp.Tester;

import java.util.Scanner;
import org.bridgelabz.addressbookApp.Controller.AddressBookController;

public class AddressBookMain {

	public static void main(String[] args) {
		AddressBookController addressBookController = new AddressBookController();

		Scanner scanner = new Scanner(System.in);
		int option;

		do {
			System.out.println(
					"1 :create newAddressBoook  \n2 :addPerson \n3 :sortByName \n4 :sortbyzip\n5 :Delete\n6 :Edit");
			option = scanner.nextInt();
			switch (option) {
			case 1:// a.createNewAddressBook();
				break;
			case 2:
				addressBookController.addPerson();
				break;
			case 3:
				addressBookController.sortByName();
				break;
			case 4:
				addressBookController.sortByZip();
				break;
			case 5:
				addressBookController.delete();
				break;
			case 6:
				addressBookController.Edit();
				break;
			default:
			}
		} while (option != 7);
	}

}