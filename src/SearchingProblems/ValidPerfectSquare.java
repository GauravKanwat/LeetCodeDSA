package SearchingProblems;

public class ValidPerfectSquare {
    public static void main(String[] args) {
        int num = 808201;
        System.out.println(validPerfectSquare(num));
    }

    static boolean validPerfectSquare(int num) {
        int first = 0;
        int last = num;
        while(first < last) {
            int mid = (first + last) / 2;
            if(last == 1)
                return true;
            if(num == mid * mid)
                return true;
            if(num < mid * mid)
                last = mid;
            if(num > mid * mid)
                first = mid;
            if(last - first == 1)
                return false;
        }
        return false;
    }
}
