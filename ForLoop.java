import java.util.Scanner;
public class ForLoop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter start and end: ");
        int start = s.nextInt();
        int end = s.nextInt();
        for(int i=start; i<=end; i++){
            System.out.println(i);
        }
        System.out.println("Happy NEW YEAR");

        for(int i=0; i<5; i++){
            if(i==3){
                continue; // skip the rest of the loop when i is 3
            }
            System.out.println("hello");
            
        }
        s.close();
    }
}
