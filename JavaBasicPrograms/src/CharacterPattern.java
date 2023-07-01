import java.util.Scanner;

public class CharacterPattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the no of lines : ");
        int n = in.nextInt();
        char ch = 'A';
        for(int line=0; line<n; line++){
            for (int chars=0; chars<=line; chars++){
                System.out.print(ch+"\t");
                ch++;
            }
            System.out.println();
        }
    }
}
