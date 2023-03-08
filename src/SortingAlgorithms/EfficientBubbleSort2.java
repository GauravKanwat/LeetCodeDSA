package SortingAlgorithms;

import java.util.Arrays;

public class EfficientBubbleSort2 {
    public static void main(String[] args) {
        int[] arr = {-3,7,0,-32,89};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr) {
        boolean check;
        for (int i = 0; i < arr.length; i++) {
            check = false;
            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j] < arr[j - 1]) {
                    check = true;
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
            if(!check)
                break;
        }
    }
}
