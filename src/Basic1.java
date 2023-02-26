import java.util.Scanner;
public class Basic1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c = 0, d = 1;
        while(n > 0) {
            int a = n % 10;
            c += a;
            d *= a;
            n = n / 10;
        }

        System.out.println(d-c);
    }
}
