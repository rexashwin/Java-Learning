package PatternProblems;

import java.util.Scanner;

public class InvertedPattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

//        //my solution
        for (int i=n; i>0; i--){
            for (int j=0; j<i; j++){
                System.out.print("*\t");
            }
            System.out.println();
        }

//        //apnacollege
        for (int i=1; i<=n; i++){
            for (int j=1; j<=(n-i+1); j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
