//https://www.hackerrank.com/challenges/apple-and-orange/problem

import java.util.List;

public class AppleAndOrange {
    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        int appleNumber = 0;
        int orangeNumber = 0;
        for (int i = 0; i < apples.size(); i++) {
            if(apples.get(i)+a>=s&&apples.get(i)+a<=t){
                appleNumber++;
            }
        }
        for (int i = 0; i < oranges.size(); i++) {
            if(oranges.get(i)+b>=s&&oranges.get(i)+b<=t){
                orangeNumber++;
            }
        }
        System.out.println(appleNumber);
        System.out.println(orangeNumber);
    }

}
