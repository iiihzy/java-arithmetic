package arithmetic.before.week9;

import java.util.Scanner;

public class IntegerBreak {
    public int integerBreak(int n) {
        if(n <= 3) return n - 1;

        int quotient = n / 3;
        if(n % 3 == 0) return (int)Math.pow(3, quotient);
        else if (n % 3 == 1)
            return (int) Math.pow(3, quotient - 1) * 4;
         else
            return (int) Math.pow(3, quotient) * 2;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(new IntegerBreak().integerBreak(sc.nextInt()));
    }
}
