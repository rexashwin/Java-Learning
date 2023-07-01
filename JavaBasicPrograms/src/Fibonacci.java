import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        long num1 = 0, num2 = 1;
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(num1);
        System.out.println(num2);
        for (int i=2; i<n; i++){
            long temp = num1 + num2;
            System.out.println(temp);
            num1 = num2;
            num2 = temp;
        }

        //  the nth term of fibonacci series
        System.out.println("the "+ n +"th term of fibonacci series: " + num2);
    }
}
