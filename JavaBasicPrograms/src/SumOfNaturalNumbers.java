import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to find sum of first natural number till : ");
        int n = input.nextInt(), sum = 0;
        for (int i=1; i<=n; i++){
            sum += i;
        }
        System.out.println("Sum of first natural number till "+n+" is: "+sum);
    }
}
