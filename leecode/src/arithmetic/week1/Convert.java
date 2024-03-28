package leetcode.edu.com;

public class Convert {

    public static String convert(String str, int numRows){
        if(numRows < 2 || numRows > str.length())
            return str;

        StringBuffer[] sb = new StringBuffer[numRows];
        for (int i = 0; i < numRows; i++) {
            sb[i] = new StringBuffer();

        }

        for(int i = 0, x = 0, timeSum = 2 * numRows - 2; i < str.length(); i++){
            sb[x].append(str.charAt(i));
            if(i % timeSum < numRows - 1)
                x++;
            else
                x--;
        }

        StringBuffer ans = new StringBuffer();
        for(StringBuffer row : sb){
            ans.append(row);
        }

        return ans.toString();
    }

    public static void main(String[] args) {

    }
}
