package SortingAlgorithms;

import java.util.Arrays;

public class EfficientBubbleSort {
    public static void main(String[] args) {
        int[] arr = {-3,7,-32,89};
        System.out.println(Arrays.toString(bubbleSorting(arr)));
}

    static int[] bubbleSorting(int[] arr) {
        boolean check = false;
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    check = true;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if(!check) {
                return arr;
            }
        }
        return arr;
    }
}
