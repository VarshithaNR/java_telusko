import java.util.Scanner;

public class IsPrime{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		boolean isprime = true;
		
		for(int i=2;i<=num/2;i++){
			if(num%i==0){
				isprime = false;
				break;
			}
		}
		if(isprime){
			System.out.println("prime");
		}
		else{
			System.out.println("not prime");
		}
		s.close();
		
	}
}