import java.util.Scanner;

public class LargestNo{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter number a : ");
		int a = s.nextInt();
		System.out.println("enter number b : ");
		int b = s.nextInt();
		System.out.println("enter number c : ");
		int c = s.nextInt();
		
		if(a>b && a>c){
			System.out.println("a is greater : " +a);
		}
		else if(b>a && b>c){
			System.out.println("b is greater: " +b);
		}
		else{
			System.out.println("c is greater : " +c);
		}
		
		s.close();
		
	}
}