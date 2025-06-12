import java.util.Scanner;

public class TilebedProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countWays(n));
        sc.close();
    }

    public static int countWays(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return countWays(n - 1) + countWays(n - 2);
    }
}
