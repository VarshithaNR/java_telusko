import java.util.Scanner;
public class Nestedloop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter number of rows: ");
        int rows = s.nextInt(); 
        System.out.print("enter number of columns: ");
        int col = s.nextInt();

        for(int i=1; i<=rows; i++){
            for(int j=1; j<=col; j++){
                System.out.print("* ");
            }
            System.out.println();
        s.close();
    }
}
}
