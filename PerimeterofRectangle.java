package day2;
import java.util.Scanner;
public class PerimeterofRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("enter the length :");
double length = sc.nextDouble();
System.out.println("enter the breadth :");
double breadth = sc.nextDouble();
double perimeter = 2*(length+breadth);
System.out.println("the perimeter is:"+ perimeter);
	}

}
