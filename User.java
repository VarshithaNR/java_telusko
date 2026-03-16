import java.util.Scanner;

public class User {
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);

        System.out.print("enter the curse word !# ");

        String curse = s.nextLine();

        System.out.println("what to u doing  " +curse);

        System.out.print("Enter your Age " );

        int age = s.nextInt();

        System.out.println("Age " +age);

        System.out.print("enter yout fav color ");

        String color = s.nextLine();

        System.out.println("color " +color);

        s.close();
    }
}
