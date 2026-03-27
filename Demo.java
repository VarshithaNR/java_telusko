class Hello{
   public int add(int num1, int num2){
   return num1 + num2;
   }
   public int add(int num1, int num2, int num3){
   return num1 + num2 + num3;
   }
}

public class Demo{
  public static void main(String[] args) {
    int num1 = 4;
    int num2 = 5;
    int num3 = 8;

    Hello cal = new Hello();
    int r = cal.add(num1, num2);
    System.out.println(r);
    Hello cal1 = new Hello();
    int r2 = cal1.add(num1, num2, num3);
    System.out.println(r2);
  }
}