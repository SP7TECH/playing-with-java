package basics.Strings;

public class PrintLargestString {
    public static void printLargest(String strArr[]) {
        String largest = strArr[0];

        for(int i = 1; i < strArr.length; i++) {
            if(strArr[i].compareTo(largest) > 0) {
                largest = strArr[i];
            }
        }

        System.out.println("Largest String: " + largest);
    }
    
    public static void main(String[] args) {
        String strArray[] = {"apple", "mango", "banana"};
        printLargest(strArray);
    }
}
