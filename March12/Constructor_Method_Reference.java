/*
 * Method reference
 * 1. constructor - instantiate an object of a class
 */
interface Trans
{
	//return type of getTrx is Stmt
	Stmt getTrx(String status);//referencing the method using constructor
}

class Stmt
{
	public Stmt(String status)
	{
		//constructor
		System.out.println(status);
	}
}
public class Constructor_Method_Reference {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		/*
		 * 
		 * Set <String> s = new HashSet<>();
		 *	s.add("python");
		 *	s.add("oracle");
		 *	s.forEach((n)->System.out.println(n));
		*/
		Trans t = Stmt::new; // t belongs to Trans interface
		t.getTrx("Trx success");
	}
}
/*
 * Method reference
 * 1. constructor - instantiate an object of a class
 * 2. static method
 * 3. instance method
 */

