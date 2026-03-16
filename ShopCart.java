import java.util.Scanner;
public class ShopCart {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String item;
        double price;
        int quantity;
        char currency;
        double total;
        System.out.print("enter item name: ");
        item = s.nextLine();
        System.out.print("enter price: ");
        price = s.nextDouble();
        System.out.print("enter quantity: ");
        quantity = s.nextInt();
        System.out.print("enter currency (e.g., $, €): ");
        currency = s.next().charAt(0);
        total = price * quantity;
        System.out.println("Item: " + item);
        System.out.println("Price: " + currency + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: " + currency + total);
        s.close();
    }
}
