public class Varags {
    
    public static void main(String[] args) {
        
        add(1,2,3);
        add(4,5,6,7,8);
    }

    static void add(int... nums){
        int sum = 0;
        for(int i: nums){
            sum += i;
        }
        System.out.println("the sum is: " + sum);

        double avg = (double)sum/nums.length;
        System.out.println("the average is: " + avg);
    }
}
