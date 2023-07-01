import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your income to know you tax : ");
        int tax, income = input.nextInt();
        if (income >= 1000000) {
            tax = (int) (income * 0.3);
            System.out.println("Your income comes under 30% tax slab so your tax is " + tax);
        }
        else if (income >= 500000) {
            tax = (int) (income * 0.2);
            System.out.println("Your income comes under 20% tax slab so your tax is " + tax);
        }
        else{
            System.out.println("Your income comes under 0% tax slab");
        }
    }
}
