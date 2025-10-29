package org.example.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SmallestMissingPositiveInteger {

    public static void main(String[] args) {
        List<Integer> orderNumbers = new ArrayList<>();
        System.out.println(findSmallestMissingPositive(orderNumbers));
        orderNumbers.add(1);
        System.out.println(findSmallestMissingPositive(orderNumbers));
        orderNumbers.add(-1);
        orderNumbers.add(-1);
        System.out.println(findSmallestMissingPositive(orderNumbers));
        orderNumbers.add(-2);
        orderNumbers.add(3);
        orderNumbers.add(4);
        orderNumbers.add(2);
        System.out.println(findSmallestMissingPositive(orderNumbers));
    }

    public static int findSmallestMissingPositive(List<Integer> orderNumbers) {
        if (orderNumbers.isEmpty()){
            return 1;
        }
        Set<Integer> distinctOrderNumber = orderNumbers.stream().filter(num -> num > 0).collect(Collectors.toCollection(TreeSet :: new));
        for (int i = 1; i < 1000; i++) {
            if (!distinctOrderNumber.contains(i)) {
                return i;
            }
        }
        return 1001;
    }

}
