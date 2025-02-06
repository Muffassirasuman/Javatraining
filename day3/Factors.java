
import java.util.Scanner;



public class Factors {
    public static void main(String[] args) {
        // for(int i=1;i<60;i++){
        //     if(60%i==0){
        //         System.out.println(i);
        //     }
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       for(int i=1;i<=n/2;i++){
        if(n%i==0){
            
                System.out.print(i+" ");
        }
       }
       System.out.println(n);
        }
    }


