package patternQuestion;

import java.util.Scanner;

public class A1_SqaurePattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

//        printing star square pattern
        for(int i=1; i<=num; i++){
            for (int j=1; j<=num; j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
        System.out.println();
//        printing number square pattern
        for(int i=1; i<=num; i++){
            for (int j=1; j<=num; j++){
                System.out.print(j+"\t");
            }
            System.out.println();
        }
        System.out.println();
//        printing same number square pattern
        for(int i=1; i<=num; i++){
            for (int j=1; j<=num; j++){
                System.out.print(i+"\t");
            }
            System.out.println();
        }
    }
}
