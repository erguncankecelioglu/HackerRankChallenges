//https://www.hackerrank.com/challenges/diagonal-difference/

import java.util.List;

public class DiagonalDifference {
    public static int diagonalDifference(List<List<Integer>> arr) {
        int sum1 = 0;
        int sum2 = 0;
        int n = arr.size();
        for (int i = 0; i<n; i++){
            sum1 += arr.get(i).get(i);
            sum2 += arr.get(i).get(n-i-1);
        }
        int res = Math.abs(sum1-sum2);
        return res;



    }
}
