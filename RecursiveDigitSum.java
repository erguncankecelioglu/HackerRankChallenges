//https://www.hackerrank.com/challenges/recursive-digit-sum/problem

public class RecursiveDigitSum {
    public static int superDigit(String n, int k) {
        int sum = 0;
        int temp = 0;
        for (int i = 0; i < n.length(); i++) {
            sum += Integer.parseInt(String.valueOf(n.charAt(i)));
        }
        sum *= k;
        while (true) {
                while (sum != 0) {
                    temp += sum % 10;
                    sum /= 10;
                }
                sum = temp;
                temp = 0;
                if (sum / 10 == 0) {
                    break;
                }
            }

        return sum;
    }

    public static void main(String[] args) {

    }
    }

