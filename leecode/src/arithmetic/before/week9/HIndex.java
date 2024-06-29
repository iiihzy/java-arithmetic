package arithmetic.before.week9;

import java.util.ArrayList;
import java.util.Scanner;

public class HIndex {
    /*public int hIndex(int[] citations) {
        Arrays.sort(citations);
        for (int i = 0; i < citations.length; i++) {
            int ends = citations.length - i;
            if(citations[i] >= ends)
                return ends;
        }
        return 0;
    }*/
    public int hIndex(int[] citations) {
        int[] counter = new int[citations.length + 1];
        int end = 0;
        for (int i = 0; i < citations.length; i++) {
            if(citations[i] >= citations.length)
                counter[citations.length]++;
            else
                counter[citations[i]]++;
        }

        for(int i = citations.length; i > 0; i--){
            end += counter[i];
            if(end >= i)
                return i;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while(sc.hasNextInt()) list.add(sc.nextInt());

        int[] nums = list.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(new HIndex().hIndex(nums));
    }
}
