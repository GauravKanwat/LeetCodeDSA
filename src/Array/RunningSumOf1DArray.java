package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RunningSumOf1DArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(runningSumOf1DArray(arr)));
    }

    static int[] runningSumOf1DArray(int[] nums) {
        int temp = 0;
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            temp += nums[i];
            result[i] = temp;
        }
        return result;
    }
}