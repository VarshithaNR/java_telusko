import java.util.Scanner;

public class WhileLoop{
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        String name = "";

        while(name!=null){
            System.out.print("enter name: ");
            name = s.nextLine();
            System.out.println("hello " + name);

        int age;
        System.out.print("enter age: ");
        age = s.nextInt();

        do{
            System.out.println("age cant be negative ");
            System.out.print("enter age: ");
            age = s.nextInt();
        }while(age<0);
        }
        s.close();
    }
}