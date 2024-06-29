package leetcode.edu.com;

import java.util.Scanner;

public class LongestPalindrome {

    public static String longestPalindrome(String str){
        // 2.动态规划
        if(str.length() < 2)
            return str;

        int begin = 0;
        int len = 1;

        boolean[][] dp = new boolean[str.length()][str.length()];
        for (int i = 0; i < str.length(); i++) {
            dp[i][i] = true;
        }

        for (int j = 1; j < str.length(); j++) {
            for (int i = 0; i < j; i++) {
                if(str.charAt(i) != str.charAt(j))
                    dp[i][j] = false;
                else {
                    if(j - i < 3){
                        dp[i][j] = true;

                    } else {
                        if(dp[i + 1][j - 1])
                            dp[i][j] = true;
                        else
                            dp[i][j] = false;
                    }
                }
                if(dp[i][j] && j - i + 1 > len){
                    len = j - i + 1;
                    begin = i;
                }
            }
        }

        return str.substring(begin, begin + len);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String res = longestPalindrome(str);
        System.out.println(res);
    }
}
