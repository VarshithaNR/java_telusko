import java.util.Scanner;
public class Gcd{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter number a : ");
        int a = s.nextInt();
        System.out.println("enter number b : ");
        int b = s.nextInt();

        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        System.out.println("gcd= " + a);

        s.close();
    }
}