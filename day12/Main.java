import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num%3==0 && num%5==0){
            System.out.println("fizzbuzz");
        }
           else if(num%3==0){
                System.out.println("fizz");
            }
           
           else if(num%5==0){
                System.out.println("buzz");
            }
            System.out.println("it does not divide by 3 and 5: " +num);
        }
        
    }
