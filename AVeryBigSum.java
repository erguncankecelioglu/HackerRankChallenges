//https://www.hackerrank.com/challenges/a-very-big-sum/problem


import java.util.List;

public class AVeryBigSum {
    public static long aVeryBigSum(List<Long> ar) {
        long sum = 0;
        for (long i : ar) {
            sum += i;
        }
        return sum;

    }

}
