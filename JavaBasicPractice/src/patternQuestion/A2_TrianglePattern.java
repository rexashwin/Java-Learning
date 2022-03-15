package patternQuestion;

import java.util.Scanner;

public class A2_TrianglePattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the no of lines in pyramid: ");
        int n = input.nextInt();

        //  use of nested loop for creating triangle
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();//new line
        }

        //  reverse triangle
        for(int i=1;i<=n;i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();//new line
        }
    }
}
