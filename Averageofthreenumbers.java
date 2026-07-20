package day2;
import java.util.Scanner;
public class Averageofthreenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number 1 :");
int number1 = sc.nextInt();
System.out.print("Enter the number 2 :");
int number2 = sc.nextInt();
System.out.print("Enter the number 3 :");
int number3 = sc.nextInt();
int Average = (number1+number2+number3)/3;
System.out.println("the average is :"+ Average);
	}

}
