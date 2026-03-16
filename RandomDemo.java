import java.util.Random;
public class RandomDemo {
    public static void main(String[] args){
        Random r = new Random();
        int n1 = r.nextInt();
        int n2 = r.nextInt();
        int n3 = r.nextInt();
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);

    }
    
}
