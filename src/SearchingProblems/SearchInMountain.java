//https://leetcode.com/problems/find-in-mountain-array/
package SearchingProblems;

public class SearchInMountain {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,5,3,1};
        int target = 3;
        System.out.println(search(arr, target));
    }

    static int search(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        int result = orderAgnostic(arr, target, 0, peak);
        if(result != -1)
            return result;
        else return orderAgnostic(arr, target, peak + 1, arr.length-1);
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1])
                end = mid;
            else start = mid + 1;
        }
        return start;
    }

    static int orderAgnostic(int[] arr, int target, int start, int end) {
        //find whether the array is in asc or desc order
        boolean isAsc = arr[start] < arr[end];
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] == target)
                return mid;
            if(isAsc) {
                if(target < arr[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            }
            else {
                if(target < arr[mid])
                    start = mid + 1;
                else end = mid = 1;
            }
        }
        return -1;
    }
}