package Array.TwoDArray;

import java.util.Arrays;

public class FlipAndInvertImage {
    public static void main(String[] args) {
        int[][] image = {
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };
        int[][] result = flipAndInvert(image);
        System.out.println(Arrays.deepToString(result));
    }

    static int[][] flipAndInvert(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                if(image[i][j] == 1)
                    image[i][j] = 0;
                else image[i][j] = 1;
            }
        }
        return image;
    }
}
