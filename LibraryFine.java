//https://www.hackerrank.com/challenges/library-fine/problem

public class LibraryFine {
    public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        if(y2-y1<0){
            return 0;
        }
        else if(y1-y2==0){
            if(m2-m1<0){
                return 0;
            }
            else if(m1-m2==0){
                if(d1-d2<=0){
                    return 0;
                }
                else{
                    return (d1-d2)*15;
                }
            }
            else{
                return (m1-m2)*500;
            }
        }
        else{
            return (y1-y2)*10000;
        }

    }

    public static void main(String[] args) {
        System.out.println(libraryFine(2,6,2014,7,6,2014));
    }
}


