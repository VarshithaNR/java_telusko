public class NestedIf {
    public static void main(String[] args) {
        boolean isStudent = true;
        boolean isSenior= false;
        double price=12.34;

        if(isStudent){
            System.out.println("you are a student discount of 10%: ");
            price *= 0.9;
        }
        else{
            price *= 1.0;
        }
        if(isSenior){
            System.out.println("you are a senior citizen discount of 20%: ");
            price *= 0.8;
        }
        else{
            price *= 1.0;
        }
        if(isStudent){
            if(isSenior){
                System.out.println("you are a student and senior citizen discount of 30%: ");
                price *= 0.7;
            }
            else{
                price *= 1.0;
            }
        }
        else{
            price *= 1.0;
        }
        System.out.println("final price is: " + price);
        
  
    }
    
}
