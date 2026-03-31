import java.util.Scanner;

public class LeapYear{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number : ");
		int year = s.nextInt();
		
		if((year%4==0&&year%100==0)||(year%400==0)){
			System.out.println("leap year " +year);
		}
		else{
			System.out.println("Not a leap year " +year);
		}
		
		s.close();
		
	}
}