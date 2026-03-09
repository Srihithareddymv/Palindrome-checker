import java.util.Scanner;

public class UC12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        PalindromeStrategy strategy = new StackStrategy();

        if(strategy.checkPalindrome(input)){
            System.out.println("The string is a Palindrome.");
        }
        else{
            System.out.println("The string is NOT a Palindrome.");
        }

        sc.close();
    }
}