package day2;
import java.util.Scanner;
public class Simpleinterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("enter the Principal amount :");
double P = sc.nextDouble();
System.out.println("enter the Rate of interest :");
double r = sc.nextDouble();
System.out.println("enter the time :");
double t = sc.nextDouble();
double SI = (P*r*t)/100;
System.out.println("Simple interest is"+ SI);
	}

}
