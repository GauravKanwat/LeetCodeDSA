package SearchingProblems;

import java.util.*;

public class KidsWithGreatestNoOfCandies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> result = new ArrayList<>(candies.length);
        for (int i = 0; i < candies.length; i++) {
            for (int j = 0; j < candies.length; j++) {
                if(candies[i] + extraCandies >= candies[j]) {
                    result.add(true);
                }
                else {
                    result.add(false);
                }
            }
        }
        return result;
    }
}
