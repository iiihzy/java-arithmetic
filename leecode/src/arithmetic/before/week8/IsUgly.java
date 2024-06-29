package arithmetic.before.week8;

import java.util.Scanner;

public class IsUgly {
    public boolean isUgly(int n) {
        if(n == 0) return false;
        while(n % 2 == 0) n /= 2;
        while(n % 3 == 0) n /= 3;
        while(n % 5 == 0) n /= 5;
        if(n == 1) return true;

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(new IsUgly().isUgly(sc.nextInt()));
    }
}
