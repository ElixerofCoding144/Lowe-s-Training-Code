interface In1
{
	void m1();
}
public class Instance_Method_Reference {

	public void calc()
	{
		System.out.println("Calling non static..");
	}
	public void calcInstance()
	{
		System.out.println("Calling Instance..");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instance_Method_Reference a = new Instance_Method_Reference();
		In1 i1 = a::calc; //(non static)
		i1.m1();
		In1 i2 = new Instance_Method_Reference()::calc;//(non static)anonymous class object or instance method
	}
}
