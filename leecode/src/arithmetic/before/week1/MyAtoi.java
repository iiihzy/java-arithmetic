package leetcode.edu.com;

import java.util.Scanner;

public class MyAtoi {

    public static int myAtoi(String str) {

        int i = 0;
        int res = 0;
        int flag = 1;

        while(str.charAt(i) == ' ') {
            i++;
        }

        if(str.charAt(i) == '-'){
            flag = -1;
            i++;
        } else if(str.charAt(i) == '+') {
            i++;
        }

        for (; i < str.length() && Character.isDigit(str.charAt(i)); i++) {
            int x = str.charAt(i) - '0';

            if(res > Integer.MAX_VALUE / 10 || res == Integer.MAX_VALUE / 10 && x > 7)
                return flag > 0? Integer.MAX_VALUE : Integer.MIN_VALUE;

            res = res * 10 + x;
        }



        return flag * res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        System.out.println(str);
    }
}
