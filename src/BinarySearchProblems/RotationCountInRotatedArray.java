package BinarySearchProblems;

public class RotationCountInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int pivot = pivotElement(arr);
        //Number of Rotations
        System.out.println(pivot + 1);
    }

    static int pivotElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1])
                return mid;
            else if(arr[mid] < arr[mid - 1])
                return mid - 1;
            else if(arr[start] > arr[mid])
                end = mid - 1;
            else if(arr[start] < arr[mid])
                start = mid + 1;
        }
        return -1;
    }
}
