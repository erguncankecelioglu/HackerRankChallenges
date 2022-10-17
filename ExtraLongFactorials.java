//https://www.hackerrank.com/challenges/extra-long-factorials/problem

//learnt operator "*" cannot be used with bigInt. Use multiply() instead.
import java.math.BigInteger;

public class ExtraLongFactorials {
    public static void extraLongFactorials(int n) {
        BigInteger result = BigInteger.valueOf(1);
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        System.out.println(result);

    }
}
