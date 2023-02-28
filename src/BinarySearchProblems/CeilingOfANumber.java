package BinarySearchProblems;

public class CeilingOfANumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 1;
        int ceil = ceiling(arr, target);
        if (target == 1) {
            System.out.println(arr[0]);
        } else System.out.println(ceil);
    }
    static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        while(start < end) {
            int mid = start + (end - start) / 2;
            if(target == arr[mid]) {
                return target;
            }
            if(target < arr[mid]) {
                if(target > arr[mid - 1]) {
                    return arr[mid];
                }
                else end = mid - 1;
            }
            if(target > arr[mid]) {
                if(target < arr[mid + 1])
                    return arr[mid + 1];
                else start = mid + 1;
            }
        }
        return -1;
    }
}