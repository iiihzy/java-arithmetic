package arithmetic.before.week2;

import java.util.Scanner;

public class MinWindow {
    public static String minWindow(String s, String t){
        if(s.isEmpty() || t.isEmpty() || s.length() < t.length())
            return "";
        int[] winFreq = new int[128];
        int[] tFreq = new int[128];
        for(char c : t.toCharArray())
            tFreq[c]++;

        int minLen = s.length() + 1;
        int begin = 0;
        int left = 0;
        int right = 0;
        int distance = 0;

        while(right < s.length()){
            if(tFreq[s.charAt(right)] == 0){
                right++;
                continue;
            }
            if(winFreq[s.charAt(right)] < tFreq[s.charAt(right)])
                distance++;

            winFreq[s.charAt(right)]++;
            right++;
            while(distance == t.length()){
                if(tFreq[s.charAt(left)] == 0){
                    left++;
                    continue;
                }
                if(right - left < minLen){
                    minLen = right - left;
                    begin = left;
                }
                if(winFreq[s.charAt(left)] == tFreq[s.charAt(left)])
                    distance--;

                winFreq[s.charAt(left)]--;
                left++;

            }
        }

        if(minLen == s.length() + 1)
            return "";

        return s.substring(begin, begin + minLen);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();

        System.out.println(minWindow(s, t));
    }
}
