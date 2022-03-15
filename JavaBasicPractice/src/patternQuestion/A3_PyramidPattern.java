package patternQuestion;

import java.util.Scanner;

public class A3_PyramidPattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a integer no: ");
        int num = in.nextInt();
        for (int i=1; i<=num; i++){
            for (int j=num-i; j>=0; j--)
                System.out.print("\t");
            for (int k=1; k<=(2*i-1); k++)
                System.out.print("*\t");
            System.out.println();
        }
    }
}
