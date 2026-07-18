package day1;
import java.util.Scanner;
public class ositiveornegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num > 0) {
        	System.out.println( num + "is a Positive Number");
        }else if (num < 0) {
        	System.out.println(num + "is a negative");
        }else {
        	System.out.println("this is zero");
        }
	}

}
