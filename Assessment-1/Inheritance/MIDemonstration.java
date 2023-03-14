package Inheritance;
class animal
{
	void display()
	{
		System.out.println("Eating...");
	}
}
class cat extends animal
{
	void display()
	{
		System.out.println("Meow...");
	}
}
class babyCat extends cat
{
	void display()
	{
		System.out.println("Crying...");
	} 
}

public class MIDemonstration {
	public static void main(String []args)
	{
		
	}
}
