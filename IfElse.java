import java.util.Scanner;
public class IfElse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter your age: ");
        int age = s.nextInt();
        if(age >= 18){
            System.out.println("you are eligible to vote");
        }
        else{
            System.out.println("you are not eligible to vote");
        }
        String name  = s.nextLine(); // consume the newline
        System.out.print("enter your name: ");
        name = s.nextLine();
        if(name.isEmpty()){
            System.out.println("name cannot be empty");
        }
        else{
            System.out.println("hello " + name);
        }
        Boolean isAdult = age >= 18;
        if(isAdult){
            System.out.println("you are an adult");
        }
        else{
            System.out.println("you are not an adult");
        }
        s.close();
    }
    
}
