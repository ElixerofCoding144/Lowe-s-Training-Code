/*
 * Method reference
 * 1. constructor - instantiate an object of a class
 * 2. static method
 * 3. instance method
 */

interface Trans
{
	void status();
}
public class Static_Method_Reference {
	public static void msgStatus() 
	{
		System.out.println("static method refernce..");
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Trans t = Static_Method_Reference::msgStatus;
		t.status();
	}

}
