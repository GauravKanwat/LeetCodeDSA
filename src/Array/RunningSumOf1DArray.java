package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RunningSumOf1DArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
//                System.out.println(nums[i]);
                int c = 0, a = 0;
                while(c < i) {
                    a += nums[j];
                    System.out.print(a + " ");
                    c++;
                }
                result[i] = nums[i] + a;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}