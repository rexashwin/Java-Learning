import java.util.Scanner;

public class SkipMultipleOf10_UsingContinue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char yesNo = 'y'; //to stop the loop if not equal to y
        while(yesNo=='y'||yesNo=='Y') {
            System.out.print("Enter your Number: ");
            int n = in.nextInt();
            if(n%10==0) continue;
            System.out.println("Your no is "+n);
            System.out.print("Want to enter again? yes=y: ");
            yesNo = in.next().trim().charAt(0);
        }
    }
}
