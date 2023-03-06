//https://leetcode.com/problems/split-array-largest-sum/
package BinarySearchProblems;

import java.util.Arrays;

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] nums = {7,2,5,8,10};
        int k = 2;
//        System.out.println(splitArray(nums, k));
        splitArray(nums, k);
    }

    public static int splitArray(int[] nums, int k) {
        int start = 0, end = 0;
        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);
            end += nums[i];
        }
        //binary search
        while(start < end) {
            int mid = start + (end - start) / 2;

            int sum = 0;
            int pieces = 1;
            for(int num : nums) {
                if(sum + num > mid) {
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }
            if(pieces > k) {
                start = mid + 1;
            }
            else end = mid;
        }
        return end;     //here start == end
    }
}
