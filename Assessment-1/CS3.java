
public class CS3 {
	public static void main(String[] args) 
	{   		 
		int x = Integer.parseInt(args[0]);    
		int y = Integer.parseInt(args[1]);    
		if(x+y == 20) 
		{    
			System.out.println("x + y is 20");    
		} 
		else if(x+y == 10)
		{    
			System.out.println("x + y is 10");    
		}
		else
		{
			System.out.println("x + y is not 10 and 20");
		}
	}
}
