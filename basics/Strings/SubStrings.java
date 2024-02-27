package basics.Strings;

public class SubStrings {
    public static String printSubstring(String str, int startIndex, int endIndex) {
        int n = str.length();
        String substr = "";

        if(endIndex > n - 1) {
            System.out.println("Not a valid ending index");
            return "";
        } else {
            // Keeping both the indexes inclusive
            for(int i = startIndex; i <= endIndex; i++) {
                substr += str.charAt(i);
            }
        }

        return substr;
    }

    public static void main(String[] args) {
        String str = "Hello World!";
        
        System.out.println("With our custom function: ");
        System.out.println(printSubstring(str, 0, 6));

        System.out.println("With subtring function: ");
        System.out.println(str.substring(0, 6));
    }
}
