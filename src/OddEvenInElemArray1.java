//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class OddEvenInElemArray1 {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int c = nums[i], a = 0;
            while(c > 0) {
                c = c / 10;
                a++;
            }
            if(a % 2 == 0)
                count++;
        }
        return count;
    }
}
