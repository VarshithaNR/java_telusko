import java.util.Scanner;

public class PalNo{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number : ");
		int num = s.nextInt();
		
		int rev = 0;
		int original = num;
		
		while(num!=0){
			int digit = num%10;
			rev=rev*10+digit;
			num=num/10;
		}
		if(original==rev){
			System.out.println("Palendrome");
		}
		else{
			System.out.println("Not Palendrome");
		}
		s.close();
		
	}
}