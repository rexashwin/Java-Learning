import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long num = 12345, temp, ans = 0;
        System.out.print("Enter the number to be reversed: ");
        num = input.nextLong();

//        //without storing the reversed number
//        while (num>0){
//            temp = num % 10;
//            System.out.print(temp);
//            num /= 10;
//        }

//        //storing the reversed number in variable 'ans'
        while (num>0){
            temp = num % 10;
            ans = ans * 10 + temp;
            num /= 10;
        }
        System.out.println(ans);
    }
}
