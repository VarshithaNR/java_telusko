import java.util.Scanner;

class Game{
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);

        String adj1;
        String non1;
        String adj2;
        String verb1;
        String adj3;

        System.out.print("enter adjective: ");
        adj1 = s.nextLine();
        System.out.print("enter noun: ");
        non1 = s.nextLine();
        System.out.print("enter adjective: ");
        adj2 = s.nextLine();
        System.out.print("enter verb: ");
        verb1 = s.nextLine();
        System.out.print("enter adjective: ");
        adj3 = s.nextLine();

        System.out.println("the " + adj1 + " " + non1 + " is " + adj2 + " and it " + verb1 + " all day long. it is a very " + adj3 + " animal.");
        System.out.println("the " + adj1 + " " + non1 + " is " + adj2 + " and it " + verb1 + " all day long. it is a very " + adj3 + " animal.");

        s.close();
    }
}