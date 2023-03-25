package com.antara;

import java.util.Iterator;
import java.util.List;

public class Invoice {
	public int eid;
	private String eName;
	private List<String> seminars;
	
	public Invoice(int eid, String eName, List<String> seminars) {
		super();
		this.eid = eid;
		this.eName = eName;
		this.seminars = seminars;
	}
	public void display()
	{
		System.out.println("Eid: "+eid+ " Ename: "+eName);
		System.out.println("Programs conducted are following: ");
		Iterator<String> iterator = seminars.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
