package basics.Strings;
import java.util.Scanner;

public class ConvertLettersToUppercase {
    public static String toUpperCase(String str) {
        StringBuilder upperCaseStr = new StringBuilder("");
    
        char ch = Character.toUpperCase(str.charAt(0));
        upperCaseStr.append(ch);

        for(int i = 1; i < str.length(); i++) {
            if(str.charAt(i) == ' ') {
                upperCaseStr.append(str.charAt(i));
                i++;
                upperCaseStr.append(Character.toUpperCase(str.charAt(i)));
            } else {
                upperCaseStr.append(str.charAt(i));
            }
        }

        return upperCaseStr.toString();
    }
    
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a string: ");

            String str = sc.nextLine();
            System.out.println("Transformed to uppercase: " + toUpperCase(str));
        }
    }
    
}
