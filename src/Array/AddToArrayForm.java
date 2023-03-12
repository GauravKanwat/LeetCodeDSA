package Array;

import java.util.Arrays;

public class AddToArrayForm {
    public static void main(String[] args) {
        int[] num = {1,2,0,0};
        int k = 34;
        System.out.println(addToArrayForm(num, k));
    }

    static int addToArrayForm(int[] num, int k) {
        int result = 0;
        for (int i = num.length - 1; i >= 0; i--) {
            result += result * 10 + num[i];
        }
        return result;
    }
}
