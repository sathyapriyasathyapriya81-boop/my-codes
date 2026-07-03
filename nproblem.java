package day1;
import java.util.Scanner;
public class nproblem {

	public static void main(String[] args) {
		Scanner obj = new Scanner (System.in);
		System.out.println("Enter the number:");// TODO Auto-generated method stub
int a =obj.nextInt(); 

if (a%2==1) {
	System.out.println("Weird");
}
else if(a>=2&&a<=5){
	System.out.println("Not weird");
	
}
else if (a>=6&&a<=20) {
	System.out.println("Weird");
}
else if (a>20) {
	System.out.println("Not Weird");
}
	}	

}
