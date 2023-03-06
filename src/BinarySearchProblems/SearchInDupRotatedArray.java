package BinarySearchProblems;

public class SearchInDupRotatedArray {
    public static void main(String[] args) {
        int[] arr = {1,1,3};
        int target = 3;
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
        while(start < end) {
            int mid = start + (end - start) / 2;
            if(mid < end && arr[mid] > arr[mid + 1])
                return mid;
            else if(mid > start && arr[mid] < arr[mid - 1])
                return mid - 1;
            else if(arr[mid] == arr[start] && arr[mid] == arr[end]) {
                //check whether start is pivot
                if(arr[start] > arr[start + 1])
                    return start;
                start++;
                //check whether end - 1 is pivot
                if(arr[end] < arr[end - 1])
                    return end - 1;
                end--;
            }
            else if(arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
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