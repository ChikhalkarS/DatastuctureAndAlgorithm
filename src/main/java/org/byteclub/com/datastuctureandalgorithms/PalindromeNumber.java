package org.byteclub.com.datastuctureandalgorithms;

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.print(isPalindrome(1234321));
    }

    private static boolean isPalindrome(int number) {
        int reversedNumber = 0;
        int originalNumner = number;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return reversedNumber == originalNumner;
    }
}
