package SearchingProblems;

import java.util.Arrays;

public class TwoSumInSortedArray {
    public static void main(String[] args) {
        int[] arr = {-1, 0};
        int target = -1;
        System.out.println(Arrays.toString(twoSumInSortedArray(arr, target)));
    }

    static int[] twoSumInSortedArray(int[] numbers, int target) {
        int[] output = new int[2];
        int index1 = 0;
        int index2 = numbers.length - 1;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[index1] + numbers[index2] == target)
                return new int[] {index1 + 1, index2 + 1};
            if(numbers[index1] + numbers[index2] < target) {
                if (index1 != numbers.length - 1)
                    index1++;
                else return new int[] {-1, -1};
            }
            else if(numbers[index1] + numbers[index2] > target) {
                if(index2 != 0)
                    index2--;
                else return new int[] {-1, -1};
            }
        }
        return new int[] {index1 + 1, index2 + 1};
    }
}
