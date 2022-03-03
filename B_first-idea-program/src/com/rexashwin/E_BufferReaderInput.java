package com.rexashwin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.io.*;

public class E_BufferReaderInput {
    public static void main(String []args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a string");
        String s = br.readLine();
        System.out.println("you entered "+s);

    }
}
