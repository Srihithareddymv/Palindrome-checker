import java.util.Scanner;
import java.util.Stack;

public class UC13 {

    public static boolean iterativePalindrome(String str) {

        str = str.replaceAll("\\s","").toLowerCase();
        int start = 0;
        int end = str.length() - 1;

        while(start < end) {
            if(str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static boolean stackPalindrome(String str) {

        str = str.replaceAll("\\s","").toLowerCase();
        Stack<Character> stack = new Stack<>();

        for(char c : str.toCharArray()) {
            stack.push(c);
        }

        for(char c : str.toCharArray()) {
            if(c != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        long startTime1 = System.nanoTime();
        boolean result1 = iterativePalindrome(input);
        long endTime1 = System.nanoTime();

        long startTime2 = System.nanoTime();
        boolean result2 = stackPalindrome(input);
        long endTime2 = System.nanoTime();

        System.out.println("\nIterative Approach Result: " + result1);
        System.out.println("Execution Time: " + (endTime1 - startTime1) + " ns");

        System.out.println("\nStack Approach Result: " + result2);
        System.out.println("Execution Time: " + (endTime2 - startTime2) + " ns");

        sc.close();
    }
}