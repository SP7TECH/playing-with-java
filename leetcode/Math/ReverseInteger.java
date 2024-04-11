package leetcode.Math;

public class ReverseInteger {
    public static int reverse(int x) {
        int reverse = 0;
        int num = x;

        if(num < 0) num *= -1;
        
        while(num > 0) {
            int lastDigit = num % 10;
            reverse = (reverse * 10) + lastDigit;
            num /= 10;
        }

        return x < 0 ? -(reverse) : reverse;
    }

    public static void main(String[] args) {
        int num = 1534236469;
        System.out.println(reverse(num));
    }
}
