package Array;

import java.util.Arrays;

public class HighestAltitude {
    public static void main(String[] args) {
        int[] gain = {-4,-3,-2,-1,4,3,2};
        System.out.println(highestAltitude(gain));
    }

//    static int highestAltitude(int[] gain) {
//        int[] altitude = new int[gain.length + 1];
//        altitude[0] = 0;
//        int peak = Integer.MIN_VALUE;
//        for (int i = 0; i < gain.length; i++) {
//            altitude[i + 1] = altitude[i] + gain[i];
//        }
//        System.out.println(Arrays.toString(altitude));
//        for (int i = 0; i < altitude.length; i++) {
//            if(peak < altitude[i])
//                peak = altitude[i];
//        }
//        return peak;
//    }
    static int highestAltitude(int[] gain) {
        int sum = 0, max = 0;
        for (int i = 0; i < gain.length; i++) {
            sum += gain[i];
            max = Math.max(sum, max);
        }
        return max;
    }
}
