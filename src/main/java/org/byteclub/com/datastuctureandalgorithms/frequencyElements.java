package org.byteclub.com.datastuctureandalgorithms;

import java.util.*;

public class frequencyElements {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 3, 3));
        Map<Integer,Integer> occurances = new HashMap<>();
        list.forEach(item -> occurances.put(item,occurances.getOrDefault(item,0)+1));

    System.out.print(occurances);


    }
}
