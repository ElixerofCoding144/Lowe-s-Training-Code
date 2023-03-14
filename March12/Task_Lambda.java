/*
1.area of rectangle
2.simple interest
3.area of circle
*/
import java.util.*;
interface SimpleInterestCalculator {
    double calculate(double principal, double rate, double time);
}

interface RectangleArea {
    double calculate(double length, double width);
}

interface CircleArea {
    double calculate(double radius);
}

public class Task_Lambda {
	public static void main(String [] args) throws Exception
	{
		SimpleInterestCalculator si = (principal, rate, time) -> (principal * rate * time) / 100;
		RectangleArea ra = (l, w) -> l * w;
        CircleArea ca = r -> Math.PI * r * r;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter principal: ");	        
		double principal = input.nextDouble();
		System.out.println("Enter rate: ");
		double rate = input.nextDouble();
		System.out.println("Enter time: ");
		double time = input.nextDouble();
		double simpleInterest = si.calculate(principal, rate, time);
		System.out.println("Simple Interest: " + simpleInterest);
		
		// Rectangle Area
		System.out.println("Enter length: ");
		double length = input.nextDouble();
		System.out.println("Enter width: ");
		double width = input.nextDouble();
        double area = ra.calculate(length, width);
        System.out.println("Rectangle Area: " + area);
        
        // Circle Area
        System.out.println("Enter radius: ");
		double radius = input.nextDouble();
		double circleArea = ca.calculate(radius);
        System.out.println("Circle Area: " + circleArea);
	}
}
