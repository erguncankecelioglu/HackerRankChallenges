//https://www.hackerrank.com/challenges/sherlock-and-squares/problem


public class SherlockAndSquares {
    public static int squares(int a, int b) {
        int x = 0;
        for (int i = 1; i <= Math.sqrt(b); i++) {
            if(i*i>=a&&i*i<=b){
                x++;
            }
        }
        return x;

    }

    public static void main(String[] args) {
        squares(3,9);

    }
}


