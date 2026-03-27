public class TwoD {

    public static void main(String[] args) {
        
        String[] fruits = {"apple", "banana", "orange", "grape", "kiwi"};
        String[] vegetables = {"carrot", "broccoli", "spinach", "potato", "tomato"};
        String[] meat = {"chicken", "beef", "pork", "lamb", "fish"};

        String[][] foods = {fruits, vegetables, meat};

        foods[0][3] = "mango";

        for(String[] food: foods){
            for(String item: food){
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }

}