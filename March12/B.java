import java.util.Set;
import java.util.HashSet;

public class B {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		  
		Set <String> s = new HashSet<>();
		s.add("python");
		s.add("oracle");
		s.forEach((n)->System.out.println(n));
		
	}
}
/*
 * Method reference
 * 1. constructor - instantiate an object of a class
 * 2. static method
 * 3. instance method
 */