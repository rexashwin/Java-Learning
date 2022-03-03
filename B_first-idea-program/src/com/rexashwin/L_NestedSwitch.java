package com.rexashwin;

import java.util.Scanner;

public class L_NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

//        switch (empID) {
//            case 1:
//                System.out.println("Kunal Kushwaha");
//                break;
//            case 2:
//                System.out.println("Rahul Rana");
//                break;
//            case 3:
//                System.out.println("Emp Number 3");
//                switch (department) {
//                    case "IT":
//                        System.out.println("IT Department");
//                        break;
//                    case "Management":
//                        System.out.println("Management Department");
//                        break;
//                    default:
//                        System.out.println("No such department found");
//                }
//                break;
//            default:
//                System.out.println("Enter correct EmpID");
//        }

        // better way to write
        switch (empID) {
            case 1 -> System.out.println("Kunal Kushwaha");
            case 2 -> System.out.println("Rahul Rana");
            case 3 -> {
                System.out.println("Emp Number 3");
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No such department found");
                }
            }
            default -> System.out.println("Enter correct EmpID");
        }
    }
}
