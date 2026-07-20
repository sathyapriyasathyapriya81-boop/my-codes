package day2;
import java.util.Scanner;
public class CelsiustoFahrenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter the celsius :");
 int Celsius = sc.nextInt();
 int Fahrenheit = (9/5*Celsius) + 32 ;
 System.out.println("Fahrenheit is " + Fahrenheit);
	}

}
