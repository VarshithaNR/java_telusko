import java.util.Scanner;

public class Fibo{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
        System.out.println("enter a number : ");
		int num = s.nextInt();
		
		int a=0,b=1;
		
		for(int i=0;i<num;i++){
			System.out.println(a+ " ");
			int c =a+b;
			a=b;
			b=c;
		}
		
		s.close();
		
	}
}