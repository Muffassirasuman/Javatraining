public class Sumofdigit
{
    public static void main(String[] args) {
        int n=12345;
        int sum=sumofdigit(n);
        while(sum>9){
            sum=sumofdigit(sum);
        }
        System.out.println(sum);
}
public static int sumofdigit(int n)
   {
    int sum=0;
    while(n!=0){
        int rem=n%10;
        sum+=rem;
        n=n/10;
    }
      return sum;
   }
}
