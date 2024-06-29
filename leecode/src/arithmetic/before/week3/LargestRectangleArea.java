package arithmetic.before.week3;

import java.util.*;

public class LargestRectangleArea {
    public int largestRectangleArea(int[] heights){
        if(heights.length == 0) return 0;
        if(heights.length == 1) return heights[0];

        int area = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < heights.length; i++) {
            while(!stack.isEmpty() && heights[stack.peekLast()] > heights[i]){
                int height = heights[stack.removeLast()];

                int width;
                if(stack.isEmpty()) width = i;
                else width = i - stack.peekLast() - 1;

                area = Math.max(area, height * width);
            }

            stack.addLast(i);
        }
        while(!stack.isEmpty()){
            int height = heights[stack.removeLast()];

            int width;
            if(stack.isEmpty()) width = heights.length;
            else width = heights.length - stack.peekLast() - 1;

            area = Math.max(area, height * width);
        }
        return area;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while(sc.hasNextInt()){
            list.add(sc.nextInt());
        }

        System.out.println(new LargestRectangleArea().largestRectangleArea(list.stream().mapToInt(Integer::intValue).toArray()));
    }
}
