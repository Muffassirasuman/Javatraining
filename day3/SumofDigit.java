public class SumofDigit {
    public static void main(String[] args) {
        int n=4321;
        int sum=0;
        int rem=0;
        while(n!=0){
         rem=n%10; //3//2//1
         sum=sum+rem;//321
         n=n/10; //12//1
        }
        System.out.println(sum);
    }
}
