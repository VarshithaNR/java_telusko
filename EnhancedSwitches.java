import java.util.Scanner;
public class EnhancedSwitches {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String day;
        System.out.print("enter the day: ");
        day = s.nextLine().toLowerCase();
        switch (day) {
            case "monday":
                System.out.println("it's the start of the week");
                break;
            case "tuesday":
                System.out.println("it's the second day of the week");
                break;
            case "wednesday":
                System.out.println("it's the middle of the week");
                break;
            case "thursday":
                System.out.println("it's almost the weekend");
                break;
            case "friday":
                System.out.println("it's party time on a weekday");
                break;
            case "saturday":
                System.out.println("it's the weekend");
                break;
            case "sunday":
                System.out.println("it's the end of the week");
                break;
        
            default:
                System.out.println("invalid day");
                break;
        }
            s.close();
            }
    }

