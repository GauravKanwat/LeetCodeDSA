package SearchingProblems;

public class GuessNoHigherOrLower {
    public static void main(String[] args) {
        int num = 500;
        int pick = 501;
        System.out.println(guessNumber(num, pick));
    }

    static int guessNumber(int num, int pick) {
        if(num > pick)
            return -1;
        if(num < pick)
            return 1;
        if(num == pick)
            return 0;
        return -1;
    }
}
