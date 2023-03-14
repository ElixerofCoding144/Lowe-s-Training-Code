package Inheritance;
class Bird
{
	void fly()
	{
		System.out.println("Flying!");
	}  
}  
class Cuckoo extends Bird{
	void sings()
	{
		System.out.println("Sings!");
	} 
}
class Parrot extends Bird{
	void talks()
	{
		System.out.println("Talks!");
	} 
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		Parrot p = new Parrot();
		p.talks();
		p.fly();

	}

}
