//https://www.hackerrank.com/challenges/plus-minus/problem

import java.util.List;

public class PlusMinusSolution {
    public static void plusMinus(List<Integer> arr) {
        double positiveCount = 0;
        double negativeCount = 0;
        double zeroCount = 0;
        for (int i=0; i<arr.size();i++){
            if (arr.get(i) > 0){
                positiveCount++;
            } else if (arr.get(i) < 0){
                negativeCount++;
            } else {
                zeroCount++;
            }
        }
        double positiveFraction = positiveCount / arr.size();
        double negativeFraction = negativeCount / arr.size();
        double zeroFraction = zeroCount / arr.size();
        System.out.printf("%.6f%n", positiveFraction);
        System.out.printf("%.6f%n", negativeFraction);
        System.out.printf("%.6f%n", zeroFraction);
    }
}
