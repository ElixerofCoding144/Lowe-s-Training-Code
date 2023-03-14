package Inheritance;
 
class Animal{
	void eats()
	{
		System.out.println("Eats!");
	} 
}
class Cat extends Animal{
	void meows()
	{
		System.out.println("Meow!");
	} 
}
public class MultilevelInheritance extends Cat{

	void dances()
	{
		System.out.println("Dances");
	}
	public static void main(String[] args)
	{
		MultilevelInheritance m = new MultilevelInheritance();
		m.dances();
		m.eats();
		m.meows();
	}

}

