import java.util.Scanner;

public class SumOfPrimes {
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static int sumOfPrimes(int L, int R) {
        int sum = 0;
        for (int i = L; i <= R; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter L and R: ");
        int L = scanner.nextInt();
        int R = scanner.nextInt();
        System.out.println("Sum of primes: " + sumOfPrimes(L, R));
        scanner.close();
    }
}