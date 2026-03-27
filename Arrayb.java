import java.util.Scanner;

public class Arrayb{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String[] fruits = {"apple", "banana", "orange", "grape", "kiwi"
        };
        String target;
        boolean isFound = false;
        System.out.print("Enter the fruit to search: ");
        target = sc.nextLine();

        for(int i=0;i<fruits.length;i++){
            if(target.equals(fruits[i])){
                System.out.println("fruit found at the index: " + i);
                isFound = true;
                break;
            }
        }

        if(!isFound){
            System.out.println("fruit not found");
        }
        sc.close();
    }
}