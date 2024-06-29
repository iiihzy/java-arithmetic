package arithmetic.before.week5;

import java.util.Scanner;

public class Pow {
    public double pow(double x, int n) {
        if(n == 1)
            return x;


        if(n % 2 != 0) {
            double half = pow(x, n / 2);

            return half * half * x;
        }
        else {
            double half = pow(x, n / 2);
            return half * half;
        }

    }
    public double myPow (double x, int n) {
        if(n == 0 || x == 1)
            return 1;
        if(n < 0)
            return 1 / pow(x, -n);
        return pow(x, n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("%.5f", new Pow().myPow(sc.nextDouble(), sc.nextInt()));
    }
}
