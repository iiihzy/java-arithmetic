package leetcode.edu.com;

public class IsPalindrome {
    public static boolean isPalindrome(int x){
        /* 方法一:
        if (x < 0 || (x % 10 == 0 && x != 0))
            return false;

        String str = String.valueOf(x);

        int left = 0;
        int right = str.length() - 1;

        while(left < right){
            if(str.charAt(left) != str.charAt(right))
                return false;

            left++;
            right--;
        }

        return true;*/


        // 方法二:
        /*if (x < 0 || (x % 10 == 0 && x != 0))
            return false;

        int reversed = 0;
        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }

        // 当数字长度为奇数时，reversed 会多一位，需要除以10去掉中间位
        return x == reversed || x == reversed / 10;*/

        // 方法三:
        StringBuilder sb = new StringBuilder();

        while (x != 0) {
            sb.append(x % 10);
            x /= 10;
        }

        StringBuilder reversed = new StringBuilder(sb).reverse();

        return sb.toString().equals(reversed.toString());
    }
    public static void main(String[] args) {

    }
}
