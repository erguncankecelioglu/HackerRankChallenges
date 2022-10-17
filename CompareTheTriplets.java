//https://www.hackerrank.com/challenges/compare-the-triplets/


import java.util.ArrayList;
import java.util.List;

public class CompareTheTriplets {
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int AliceRating = 0;
        int BobRating = 0;
        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < a.size(); i++){
            if(a.get(i) > b.get(i)){
                AliceRating++;
            }else if(a.get(i) < b.get(i)){
                BobRating++;
            }
        }
        result.add(AliceRating);
        result.add(BobRating);
        return result;
    }

}
