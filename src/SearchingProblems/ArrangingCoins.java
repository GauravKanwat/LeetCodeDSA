package SearchingProblems;

public class ArrangingCoins {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(arrangeCoins(n));
    }

    static int arrangeCoins(int n) {
        int count = 0, row = 0;
        while(count <= n) {
            n = n - count;
            count++;
        }
        return count;
    }
}
