package SearchingProblems;

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 8;
        int[] result = firstAndLast(arr, target);
        System.out.println(Arrays.toString(result));
    }

    static int[] firstAndLast(int[] arr, int target) {
        int[] ans = {-1,-1};
        int start = search(arr, target, true);
        int end = search(arr, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }

    static int search(int[] arr, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(target < arr[mid])
                end = mid - 1;
            else if(target > arr[mid])
                start = mid + 1;
            else {
                //Potential ans
                ans = mid;
                if(findStartIndex)
                    end = mid - 1;
                else start = mid + 1;
            }
        }
        return ans;
    }
}
