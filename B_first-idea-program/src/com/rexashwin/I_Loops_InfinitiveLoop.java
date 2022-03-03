package com.rexashwin;

import java.util.Scanner;

public class I_Loops_InfinitiveLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        //   infinitive for loop
//        for(;;){
//            String name = input.nextLine();
//            System.out.println("Hello " + name);
//        }

        // infinitive while loop
//        while(true){
//            String name = input.nextLine();
//            System.out.println("Hello " + name);
//        }

        // infinitive do while loop
        do{
            String name = input.nextLine();
            System.out.println("Hello " + name);
        } while(true);
    }
}
