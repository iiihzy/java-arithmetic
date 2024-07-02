package arithmetic.july.july_2;

public class SmallestString {
    public String smallestString(String s) {
        int p = 0;
        while(p < s.length() && s.charAt(p) == 'a') p++;
        if(p == s.length()) return s.substring(0, s.length() - 1) + 'z';
        StringBuilder sb = new StringBuilder(s);
        while(p < s.length() && sb.charAt(p) != 'a') sb.setCharAt(p, (char)(sb.charAt(p++) - 1));

        return sb.toString();
    }
}
