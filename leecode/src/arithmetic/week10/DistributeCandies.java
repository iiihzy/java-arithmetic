package arithmetic.week10;

import java.util.Scanner;

public class DistributeCandies {
    public int distributeCandies(int n, int limit) {
        if (n > limit * 3) return 0;
        int ans = 0;
        for(int i = 0; i <= Math.min(n, limit); i++) {
            if(n - i > limit * 2) continue;
            ans += Math.min(limit, n - i) - Math.max(0, n - i - limit) + 1;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(new DistributeCandies().distributeCandies(sc.nextInt(), sc.nextInt()));
    }
}
