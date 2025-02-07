public class Swap {
    public static void main(String[] args) {
      int a=5,b=7;
    //    int temp=a;
    //    a=b;
    //    b=temp;
       a=a+b;
       b=a-b;
       a=a-b;
        System.out.println(a);
       System.out.println(b);
    }
}
