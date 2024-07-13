package org.byteclub.com.datastuctureandalgorithms;

import java.util.HashSet;

public class CommonDigits {

    public static void main(String[] args) {
        boolean result = hasCommonDigits(431243,12534);
        System.out.print(result);
    }

    private static boolean hasCommonDigits(int input1, int input2) {

       String s1 = String.valueOf(input1);
       String s2 = String.valueOf(input2);

        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();

        for(char temp :s1.toCharArray())
        {
            set1.add(temp);
        }
        for(char temp :s2.toCharArray())
        {
            set2.add(temp);
        }
        int originalLength = set1.size();
        set1.addAll(set2);

        return set1.size() == originalLength && set1.size()==set2.size();

    }
}
