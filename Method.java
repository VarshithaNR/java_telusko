public class Method {
   public static void main(String[] args) {
    String name = "BVC";
    int age = 22;
    HappyBirthday(name, age);
    double num = 25.5;
    Cube(num);

    double a = 10.5, b = 20.5, c = 30.5;
    add(a, b);
    add(a, b, c);
        
   }
   static void HappyBirthday(String name, int age){
        System.out.println("happy birthday to you");
        System.out.println("happy birthday to you");
        System.out.println("happy birthday to you");
        System.out.println("happy birthday dear " + name);
        System.out.println("you are " + age + " today");
        System.out.println("happy birthday to you");
   }

   static void Cube(double num){
    double result = num * num * num;
    System.out.println("the cube of " + num + " is " + result);
   }

   static double add(double a, double b){
    return a + b;
   }

   static double add(double a, double b, double c){
    return a + b + c;
   }
}
