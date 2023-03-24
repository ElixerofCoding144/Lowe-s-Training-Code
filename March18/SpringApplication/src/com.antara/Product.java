package com.antara;

public class Product 
{
	String pName;
	//setter method
//	public void setpName(String pName) {
//	this.pName = pName;
//}
	
	public void show()
	{
		System.out.println("Thanks for purchasing "+pName);
	}
	//using constructor
	public Product(String pName) {
		this.pName = pName;
	}


	
}
