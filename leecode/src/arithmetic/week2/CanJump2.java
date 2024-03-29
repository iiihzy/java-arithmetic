package arithmetic.week2;

import java.util.ArrayList;
import java.util.Scanner;

public class CanJump2 {
    public static boolean canJump(int[] nums){

        int end = nums.length - 1;
        for (int i = nums.length - 2; i > 0; i--) {
            if(i + nums[i] >= end)
                end = i;
        }

        return end == 0;
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<>();

    while(sc.hasNextInt()){
        int num = sc.nextInt();
        list.add(num);
    }

    int[] arr = list.stream().mapToInt(Integer::intValue).toArray();
        /*for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if((i + 1) % 4 == 0)
                System.out.println();
        }*/
    System.out.println(canJump(arr));
}

}
