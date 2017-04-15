package org.bridgelab.addbookApp.Service;

import java.util.Comparator;

import org.bridgelab.addbookApp.Model.Person;

public class SortByName implements Comparator
{

	public int compare(Object o1, Object o2)
	{
		
		Person p=(Person) o1;
		Person p2=(Person) o2;
		return p.getFirstName().compareTo(p2.getFirstName());
	}

}
