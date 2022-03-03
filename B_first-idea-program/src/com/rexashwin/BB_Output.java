package com.rexashwin;

public class BB_Output {
    public static void main(String[] args) {
//        ## printing using println
        int x = 100;
        System.out.println("this is a string");
        System.out.println("the value of x is " + x);

//        ## only using print will print without adding a new line
        System.out.print("string1 ");
        System.out.println("string2");

//        ## printing using format
        double z = Math.PI;
        System.out.println(z);
        System.out.format("%f\n",z);
        System.out.format("%.2f\n",z);
        System.out.printf("%5.2f\n",z);
        System.out.printf("%05.2f\n",z);
        System.out.printf("%07.2f\n",z);

//        ## Escape sequence in java
//        System.out.println("Welcome to "GeeksForGeeks""); // this line will give compilation error
        System.out.println("Welcome to \"GeeksForGeeks\"");
        System.out.println("path:C:\\xyz\\abc.\\txt");
        /* The valid escape sequences are
            \t	Inserts a tab in the text at this point.
            \b	Inserts a backspace in the text at this point.
            \n	Inserts a newline in the text at this point.
            \r	Inserts a carriage return to the text at this point.
            \f	Inserts a form feed in the text at this point.
            \'	Inserts a single quote character in the text at this point.
            \"	Inserts a double quote character in the text at this point.
            \\	Inserts a backslash character in the text at this point.
         */

    }
}
