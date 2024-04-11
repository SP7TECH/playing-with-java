package leetcode.String;

public class ReverseString {
    public static void printArr(char[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;

        while(start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;

            start++;
            end--;
        }

        printArr(s);
    }

    public static void main(String[] args) {
        char s[] = {'h','e','l','l','o'};
        reverseString(s);
    }
}
