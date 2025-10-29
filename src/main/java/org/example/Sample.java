package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'findSmallestMissingPositive' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY orderNumbers as parameter.
     */

    public static int findSmallestMissingPositive(List<Integer> orderNumbers) {
        if (orderNumbers.isEmpty()){
            return 1;
        }

        List<Integer> positiveOrderNumbers = orderNumbers.stream().
                distinct().sorted().filter(x-> x > 0).collect(Collectors.toList());

        if (positiveOrderNumbers.isEmpty()) {
            return 1;
        }

        int difference = positiveOrderNumbers.get(0) - positiveOrderNumbers.get(1);
        int difference2  = positiveOrderNumbers.get(1) - positiveOrderNumbers.get(2);
        if( difference ==  difference2){
            for (int i = 3 ; i < positiveOrderNumbers.size(); i++) {
                if (positiveOrderNumbers.get(i - 1) != positiveOrderNumbers.get(i) - difference) {
                    return positiveOrderNumbers.get(i - 1) + difference;
                }
            }
        } else if (difference  == positiveOrderNumbers.get(2) - positiveOrderNumbers.get(3)){
            return positiveOrderNumbers.get(1) + difference;
        }
        return positiveOrderNumbers.get(0) + difference2;

    }

}

public class Sample {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int orderNumbersCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> orderNumbers = IntStream.range(0, orderNumbersCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine().replaceAll("\\s+$", "");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.findSmallestMissingPositive(orderNumbers);

        System.out.println(result);

        bufferedReader.close();
    }
}
