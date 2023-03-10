//https://leetcode.com/problems/create-target-array-in-the-given-order/
package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TargetArrayInGivenOrder {
    public static void main(String[] args) {
        int[] index = {0,1,2,2,1};
        int[] nums = {0,1,2,3,4};
        System.out.println(Arrays.toString(targetArrayInGivenOrder(index, nums)));
    }

    static int[] targetArrayInGivenOrder(int[] index, int[] nums) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int[] target = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr.add(index[i], nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            target[i] = arr.get(i);
        }
        return target;      //output: [0,4,1,3,2]
    }
}
