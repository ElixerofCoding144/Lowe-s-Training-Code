package AMS;

public class Ams {
	public static void main(String [] args)
	{
		int atnd = 280;
		int sid = Integer.parseInt(args[0]);
		String sname = args[1];
		int m1 = Integer.parseInt(args[2]);
		int m2 = Integer.parseInt(args[3]);
		int m3 = Integer.parseInt(args[4]);
		int nop = Integer.parseInt(args[5]);
		int total = m1+m2+m3;
		float avg = total/3;
		float reg = nop*100/atnd;
		System.out.println("Student ID : " +sid);
		System.out.println("Student name : " +sname);
		System.out.println("Total marks : " +total);
		System.out.println("Average marks : " +avg);
		System.out.println("Number of days(present) : " +nop);
		System.out.println("Regularity Percentage : " +reg);
		
	}
}
