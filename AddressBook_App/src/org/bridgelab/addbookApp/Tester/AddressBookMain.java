package org.bridgelab.addbookApp.Tester;

import java.util.Scanner;

import org.bridgelab.addbookApp.Controller.AddressBoookController;

public class AddressBookMain {
	
	public static void main(String[] args) 
	{
		AddressBoookController a=new AddressBoookController();
		
		Scanner sc=new Scanner(System.in);
		int n;
		
		do
		{System.out.println("1 :create newAddressBoook  \n2 :addPerson \n3 :sortByName \n4 :sortbyzip\n5 :Delete\n6 :Edit");
		 n=sc.nextInt();
		 switch(n)
		 {
		 case 1:a.createNewAddressBook();
		 break;
		 case 2:a.addPerson();
		 break;
		 case 3:a.sortByName();
		 break;
		 case 4:a.sortByZip();
		 break;
		 case 5:a.delete();
		 break;
		 case 6:a.Edit();
		 break;
		 default:
		 }
		}
		while(n!=7);
	}

}
