public class OddEvenInElementsArray {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7892};
        for (int i = 0; i < nums.length; i++) {
            int c = nums[i], a = 0;
            while(c > 0) {
                c = c / 10;
                a++;
            }
            if(a % 2 == 0)
                System.out.println(nums[i] + " contains " +a+ " digits (Even).");
            else if(a == 1)
                System.out.println(nums[i] + " contains " +a+ " digit (Odd).");
            else System.out.println(nums[i] + " contains " +a+ " digits (Odd).");
        }
    }
}
