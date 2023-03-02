//https://leetcode.com/problems/peak-index-in-a-mountain-array/
package BinarySearchProblems;

public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {0, 5, 10, 5, 0};
        System.out.println(mountainArray(arr));
    }

    static int mountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start < end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1]) {
                //potential ans but check at LHS also
                end = mid;
            }
            else {
                start = mid + 1;
            }
        }
        return start;
    }
}
