public class Printf {
    public static void main(String[] args) {
        int age = 22;
        String name = "telusko";
        char gender ='F';
        double height = 5.8;
        boolean isAdult = true;
        System.out.printf("my name is %s : \n" , name);
        System.out.printf("my age is %d : \n" , age);
        System.out.printf("gender is %c : \n" , gender);
        System.out.printf("height is %.3f : \n" , height);
        System.out.printf("is adult is %b : \n" , isAdult);
    
        double price = 9.22;
        double discount = 0.22;
        double finalPrice = price - (price * discount);
        System.out.printf("final price is %.1f : \n" , finalPrice);
    }
}
