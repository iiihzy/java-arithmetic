package leetcode.edu.com;

import java.util.Scanner;

public class Reverse {

    public static int reverse(int x){
        /*int reversed = 0;
        while(x != 0){
            int fresh = reversed * 10 + x % 10;

            if((fresh - x % 10) / 10 != reversed)
                return 0;

            reversed = fresh;
            x /= 10;
        }

        return  reversed;*/

        StringBuilder sb = new StringBuilder();
        boolean isMinus = x < 0;
        if(isMinus)
            x = -x;

        while(x != 0){
            sb.append(x % 10);
            x /= 10;
        }

        int reversed = Integer.parseInt(sb.toString());

        StringBuilder sb2 = new StringBuilder();
        sb2.append(reversed);

        if(sb2.toString().contentEquals(sb)){
            if(isMinus)
            return -reversed;
            return reversed;
        }

        return 0;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int res = reverse(n);
        System.out.println(res);
    }
}
