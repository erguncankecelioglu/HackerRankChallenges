//https://www.hackerrank.com/challenges/staircase/

public class StairCase {
    public static void staircase(int n) {
        for(int i=0; i<n;i++){
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i+1; j++) {
                System.out.print("#");
            }
            System.out.println("");
        }


    }

}