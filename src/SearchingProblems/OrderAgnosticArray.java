package SearchingProblems;

public class OrderAgnosticArray {
    public static void main(String[] args) {
        int[] arr = {-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int target = 0;
        int result = orderAgnostic(arr, target);
        System.out.println(result);
    }

    static int orderAgnostic(int[] arr, int target) {
        //find whether the array is in asc or desc order
        int start = 0;
        int end = arr.length - 1;
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
