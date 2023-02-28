package Array;

import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,4,3,2,1};
        shuffleArray(nums);
    }
    static void shuffleArray(int[] nums) {
        int mid = nums.length / 2;
        int[] arr = new int[nums.length];
        int i = 0;
        while(i < nums.length-2) {
            arr[i] = nums[i];
            arr[i+1] = nums[mid + i + 1];
            i += 1;
        }
        System.out.println(Arrays.toString(arr));
    }
}
