package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class ConcateArrays {
    public static void main(String[] args) {
        int[] num = {1,2,1};
        int[] ans = new int[2*num.length];
        int i = 0, n = num.length;
        while(i < num.length) {
            ans[i] = num[i];
            ans[i+n] = num[i];
            i++;
        }
        System.out.println(Arrays.toString(ans));
    }
}
