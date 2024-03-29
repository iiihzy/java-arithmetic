package arithmetic.week2;

import java.util.ArrayList;
import java.util.Scanner;

public class CanJump {
    public static boolean canJump(int[] nums){

        int reach = 0;
        for (int i = 0; i < nums.length; i++) {
            if(i > reach)
                return false;
            if(reach >= nums.length - 1)
                return true;
            reach = Math.max(reach, i + nums[i]);
        }

        return false;
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
