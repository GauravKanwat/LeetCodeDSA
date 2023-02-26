import java.util.Arrays;

public class PermutationArray {
    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        aPermutation(nums,0);
        System.out.println(Arrays.toString(nums));
    }

    static void aPermutation(int[] nums, int start) {
        if(start<nums.length) {
            int temp = nums[start];
            int ans = nums[temp];
            aPermutation(nums, start+1);
            nums[start] = ans;
        }
    }
}