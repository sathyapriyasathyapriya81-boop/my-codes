package day2;
import java.util.Scanner;
public class Areacircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.print("Enter the radius :");
double radius = sc.nextDouble();
double area = 3.14* radius*radius;
System.out.println("Area of the circle :" + area);
	}

}
