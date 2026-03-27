import java.util.Scanner;
public class Logicalop {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        String username;

        System.out.print("enter username: ");
        username = scanner.nextLine();

        if(username.length() >= 4 && username.length() <= 12){
            System.out.println("valid username");
        } else {
            System.out.println("invalid username");
        }
        scanner.close();
    }
    
}
