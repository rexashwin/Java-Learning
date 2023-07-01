import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find its prime or not : ");
        int n = sc.nextInt();

        if (n <= 1)
            System.out.println("neither prime nor composite");
        else if (n == 2)
            System.out.println("n is prime");
        else {
            boolean isPrime = true;

//            //this will run n-2 times
            for (int i = 2; i <= n - 1; i++) {
                if (n % i == 0) {       //check if n is a multiple of i (i not equal to 1 or n)
                    isPrime = false;
                    break;
                }
            }

//            //this will run 'square root of n' times
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {       //n is a multiple of i (i not equal to 1 or n
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("n is prime");
            } else {
                System.out.println("n is not prime");
            }
        }

    }
}
