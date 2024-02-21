package basics.Strings;
import java.util.Scanner;

public class PalindromicString {
    public static boolean isPalindromic(String str) {
        int n = str.length();

        for(int i = 0; i < n/2; i++) {
            if(str.charAt(i) != str.charAt(n-i-1)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a string to check if it is palindromic or not: ");

            String str = sc.nextLine();
            if(isPalindromic(str)) {
                System.out.println("Entered string is a palindrome");
            } else {
                System.out.println("Entered string is not a palindrome");
            }
        }
    }
}
