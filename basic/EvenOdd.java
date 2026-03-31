import java.util.Scanner;

public class EvenOdd{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
        System.out.print("Enter a number : ");
		int num = s.nextInt();
		
		if(num%2==0){
			System.out.println("even number :  " +num);
		}
		else{
			System.out.println("odd number :  " +num);
		}
	s.close();
	}
}
