import java.util.Scanner;
class MathClass{
    public static void main(String[] args){
        System.out.println(Math.PI);
        System.out.println(Math.E);
        System.out.println(Math.sqrt(16));
        System.out.println(Math.pow(2, 3));
        System.out.println(Math.abs(-5));
        System.out.println(Math.ceil(5.6));
        System.out.println(Math.floor(5.6));

        Scanner s = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.print("enter a: ");
        a = s.nextDouble();
        System.out.print("enter b: ");
        b = s.nextDouble();
        
        c =Math.sqrt(Math.pow(a,2)+ Math.pow(b,2));
        System.out.println("c = " + c);

        System.out.print("enter radius: ");
        double r = s.nextDouble();
        double circumference = 2 * Math.PI * r;
        System.out.println("circumference = " + circumference);

        double area = Math.PI * Math.pow(r, 2);
        System.out.println("area = " + area);

        double volume = (4/3) * Math.PI * Math.pow(r, 3);
        System.out.println("volume = " + volume);

        s.close();
    }
}