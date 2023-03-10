package SearchingProblems;

public class SquareRoot {
    public static void main(String[] args) {
        int x = 2147395599;
        System.out.println(squareRoot(x));
    }

    static int squareRoot(int x) {
        if(x == 0)
            return 0;
        int left = 0, right = Integer.MAX_VALUE;
        while(true) {
            int mid = left + (right - left) / 2;
            if(mid > x / mid)
                right = mid - 1;
            else {
                if(mid + 1 > x / (mid + 1))
                    return mid;
                left = mid + 1;
            }
        }
    }
}
