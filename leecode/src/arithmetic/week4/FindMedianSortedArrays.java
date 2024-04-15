package arithmetic.week4;

import java.util.ArrayList;
import java.util.Scanner;

public class FindMedianSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length == 0) {
            if(nums2.length % 2 != 0)
                return nums2[(nums2.length + 1) / 2 - 1] * 1.0;
            else
                return (nums2[nums2.length / 2] + nums2[nums2.length / 2 - 1]) / 2.0;
        }
        if(nums2.length == 0) {
            if (nums1.length % 2 != 0)
                return nums1[(nums1.length + 1) / 2 - 1] * 1.0;
            else
                return (nums1[nums1.length / 2] + nums1[nums1.length / 2 - 1]) / 2.0;
        }

        int[] arr = new int[(nums2.length + nums1.length) / 2 + 1];
        int p1 = 0;
        int p2 = 0;
        int count = 0;
        while(p1 + p2 < (nums2.length + nums1.length ) / 2 + 1) {
            if(p2 == nums2.length) {
                arr[count++] = nums1[p1++];
                continue;
            }
            if(p1 == nums1.length) {
                arr[count++] = nums2[p2++];
                continue;
            }

            if(nums1[p1] > nums2[p2])  arr[count++] = nums2[p2++];

            else  arr[count++] = nums1[p1++];
        }
        if((nums1.length + nums2.length) % 2 == 0)
            return (arr[arr.length - 1] + arr[arr.length - 2]) / 2.0;
        else
            return arr[arr.length - 1] * 1.0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (sc.hasNextInt()) {
            list.add(sc.nextInt());
        }

        int[] nums1 = list.stream().mapToInt(Integer::intValue).toArray();

        sc = new Scanner(System.in);
        list = new ArrayList<>();
        while (sc.hasNextInt()) {
            list.add(sc.nextInt());
        }

        int[] nums2 = list.stream().mapToInt(Integer::intValue).toArray();
        double result = new FindMedianSortedArrays().findMedianSortedArrays(nums1, nums2);
        System.out.printf("%.6f", result);
    }
}
