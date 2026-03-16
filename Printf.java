public class Printf {
    public static void main(String[] args) {
        int age = 22;
        String name = "telusko";
        char gender ='F';
        double height = 5.8;
        boolean isAdult = true;
        System.out.printf("my name is %s : " , name);
        System.out.printf("my age is %d : " , age);
        System.out.printf("gender is %c : " , gender);
        System.out.printf("height is %.3f : " , height);
        System.out.printf("is adult is %b : " , isAdult);
    
        double price = 9.22;
        double discount = 0.22;
        double finalPrice = price - (price * discount);
        System.out.printf("final price is %.1f : " , finalPrice);
    }
}
