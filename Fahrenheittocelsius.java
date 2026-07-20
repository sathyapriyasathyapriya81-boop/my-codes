package day2;
import java.util.Scanner;
public class Fahrenheittocelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.print("Enter the Fahrenheit :");
double Fahrenheit = sc.nextDouble() ;
double  Celsius = (Fahrenheit-32)*5.0/9;
System.out.println("the celsius is "+Celsius);
	}

}
