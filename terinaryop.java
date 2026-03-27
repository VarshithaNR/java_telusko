public class terinaryop {
    public static void main(String[] args) {
        int a =78;
        String result = (a%2==0) ? "even" : "odd";
        System.out.println(result);
        int hours  = 10;
        String greeting = (hours < 12) ? "good morning" : "good afternoon";
        System.out.println(greeting);
        int income = 45000;
        String tax = (income > 50000) ? "high tax" : "low tax";
        System.out.println(tax);
    }
}
