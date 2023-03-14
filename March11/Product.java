import java.util.*;
public class Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of products : ");
		int p = sc.nextInt();
		for(int i = 0; i < p; i++)
		{
			Random pid = new Random();
			//System.out.println("Your pid");
			System.out.println("Enter product name: ");
			String pname = sc.next();
			System.out.println("The id of your product "+pname+" is "+pid.nextInt(99999));
			System.out.println("Upstock: ");
			int up = sc.nextInt();
			System.out.println("Quantity: ");
			int qty = sc.nextInt();
			System.out.println("Stock: ");
			int stk = sc.nextInt();	
			if(qty > stk)
			{
				System.out.println("Out of Stock");
			}
			else
			{
				int total_cost = qty*up;
				System.out.println("Total cost : "+total_cost);
				int stock_left = stk - qty;
				System.out.println("Stock left : "+stock_left);			
			}							
		}

	}

}
