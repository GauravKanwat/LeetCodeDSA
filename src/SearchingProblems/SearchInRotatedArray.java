//https://leetcode.com/problems/search-in-rotated-sorted-array
package SearchingProblems;

public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {1,3};
        int target = 0;
        System.out.println(search(arr, target));
    }

    static int search(int[] arr, int target) {
        int pivot = pivotInRotatedArray(arr);
        int result = binarySearch(arr, target, 0, pivot);
        if(result != -1) {
            return result;
        }
        else return binarySearch(arr, target, pivot+1, arr.length-1);
    }

    static int pivotInRotatedArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(mid < end && arr[mid] > arr[mid + 1])
                return mid;
            else if(mid > start && arr[mid] < arr[mid - 1])
                return mid - 1;
            else if(arr[start] > arr[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }
        return start;
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(target == arr[mid])
                return mid;
            else if(target > arr[mid]) {
                start = mid + 1;
            }
            else end = mid - 1;
        }
        return -1;
    }
}
