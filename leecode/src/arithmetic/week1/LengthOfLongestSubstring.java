package leetcode.edu.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LengthOfLongestSubstring {

    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> hashTable = new HashMap<>();

        int length = 0;
        int max_length = 0;
        int index = 0;

        for (int i = 0; i < s.length(); i++) {
            if (!hashTable.containsKey(s.charAt(i))) {
                length++;
                hashTable.put(s.charAt(i), i);
            }

            else {
                if (max_length < length)
                    max_length = length;

                index = Math.max(index, hashTable.get(s.charAt(i)));
                length = i - index;
                hashTable.put(s.charAt(i), i);
            }
        }

        max_length = Math.max(length, max_length);
        return max_length;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int result = lengthOfLongestSubstring(s);
        System.out.println(result);
    }
}
