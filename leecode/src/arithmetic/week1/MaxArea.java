package leetcode.edu.com;

import java.util.Map;
import java.util.Scanner;

public class MaxArea {
    public static int maxArea(int[] height){

        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while(left < right){
            maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left));
            if(height[left] > height[right])
                right--;
            else
                left++;
        }

        return maxArea;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int res = maxArea(arr);
        System.out.println(res);
    }
}
