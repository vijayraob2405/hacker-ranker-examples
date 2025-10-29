package org.example.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CountGreaterThanPreviousAverage {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(-200);
        numbers.add(150);
        numbers.add(-300);
        System.out.println(countResponseTimeRegressions(numbers));
    }

    public static int countResponseTimeRegressions(List<Integer> responseTimes) {
        if (Objects.isNull(responseTimes) || responseTimes.isEmpty()){
            return 0;
        }
        int count = 0;
        double previousSum = 0;
        for (int i = 1; i < responseTimes.size(); i++) {
            previousSum += responseTimes.get(i-1);
            if ((previousSum/i) < responseTimes.get(i)){
                count ++;
            }
        }
        return count;
    }
}
