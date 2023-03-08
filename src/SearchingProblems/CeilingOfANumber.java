package SearchingProblems;

public class CeilingOfANumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 4;
        int ceil = ceiling(arr, target);
        System.out.println(ceil);
    }
    static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        if(target > arr[end])
            return -1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(target == arr[mid])
                return arr[mid];
            else if(target < arr[mid]) {
                end = mid - 1;
            }
            else if(target > arr[mid]) {
                start = mid + 1;
            }
        }
        return arr[start];
    }
}