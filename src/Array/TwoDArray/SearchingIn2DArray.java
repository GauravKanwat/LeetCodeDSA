package Array.TwoDArray;

import java.util.Arrays;

public class SearchingIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {18,9,12},
                {36,-4,91},
                {44,33,16}
        };
        int target = 91;
        System.out.println(Arrays.toString(searchInArray(arr, target)));
    }

    static int[] searchInArray(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(target == arr[i][j])
                    return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }
}
