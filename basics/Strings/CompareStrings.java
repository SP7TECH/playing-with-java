package basics.Strings;

public class CompareStrings {
    public static void main(String[] args) {
        String str1 = "Stark";
        String str2 = "Stark";
        
        String str3 = new String("Stark");

        System.out.println("With equals to: ");
        if(str1 == str2 && str1 == str3) {
            System.out.println("Same string");
        } else {
            System.out.println("Not the same string");
        }

        System.out.println("With compare function: ");
        if(str1.equals(str2) && str1.equals(str3)) {
            System.out.println("Same string");
        } else {
            System.out.println("Not the same string");
        }
    }
}
