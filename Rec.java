import java.util.Scanner;
class Rec{
    public static void main(String[] args) {

        
        System.out.println("area of rectangle: ");

        Scanner s = new Scanner(System.in);
        System.out.print("enter height and width: ");
        double h = s.nextDouble();
        double w = s.nextDouble();
        double area = h * w;
        System.out.println("area = " + area);
        s.close();

    }
}