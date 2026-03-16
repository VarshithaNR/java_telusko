import java.util.Scanner;
public class CompIntrest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter principal: ");
        double p = s.nextDouble();
        System.out.print("enter rate: ");
        double r = s.nextDouble()/100;
        System.out.print("enter time: ");
        double t = s.nextDouble();
        System.out.print("enter the year: ");
        int y = s.nextInt();

        double ci = p * Math.pow((1 + r/t), t*y);
        System.out.println("compound intrest = " + ci);
        s.close();
    }
    
}
