class Hello{
   int a;
   public int add(int num1, int num2){
   int res = num1 + num2;
   return res;
   }
}

public class Demo{
  public static void main(String[] args) {
    int num1 = 4;
    int num2 = 5;

    Hello cal = new Hello();
    int r = cal.add(num1, num2);
    System.out.println(r);
  }
}