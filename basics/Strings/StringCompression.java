package basics.Strings;
import java.util.Scanner;

public class StringCompression {
    public static String compressString(String str) {
        StringBuilder compressedStr = new StringBuilder("");

        char firstLetter = str.charAt(0);
        compressedStr.append(firstLetter);

        int count = 1;
        for(int i = 1; i < str.length(); i++) {
            if(str.charAt(i - 1) == str.charAt(i)) {
                count++;
            } else {
                if(count > 1) {
                    compressedStr.append(count);
                }
                count = 1;
                compressedStr.append(str.charAt(i));
            }

            if (i == str.length() - 1 && count > 1) {
                compressedStr.append(count);
            }
        }

        return compressedStr.toString();
    }

    public static String compress(String str) {
        String compressedStr = "";

        for(int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while(i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }

            compressedStr += str.charAt(i);
            if(count > 1) {
                compressedStr += count.toString();
            }
        }

        return compressedStr;
    }
 
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a string: ");
            
            String str = sc.nextLine();
            System.out.println("Compressed String: " + compressString(str));
            System.out.println("Compressed String: " + compress(str));
        }
    }
    
}
