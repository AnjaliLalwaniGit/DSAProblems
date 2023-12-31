package Arrays;
/*
Given an array of integers heights representing the histogram's bar height where the width of each bar is 1, return the area of the largest rectangle in the histogram.



Example 1:


Input: heights = [2,1,5,6,2,3]
Output: 10
Explanation: The above is a histogram where width of each bar is 1.
The largest rectangle is shown in the red area, which has an area = 10 units.
Example 2:


Input: heights = [2,4]
Output: 4


Constraints:

1 <= heights.length <= 105
0 <= heights[i] <= 104
 */

import java.util.Stack;

public class Histogram {

    public static void main(String[] args) {
        int[] heights = {2,1,5,6,2,3};
        System.out.println(largestRectangleArea(heights));

    }

    public static int largestRectangleArea(int[] heights) {
        int maxArea=0;
        int n=heights.length;
        Stack<Integer> st=new Stack();

        for(int i=0;i<=n;i++){
            int ht= (i == n) ? 0:heights[i];
            if(st.isEmpty() || ht >= heights[st.peek()] ){
                st.push(i);
            }
            else{
                int top=st.pop();
                int width=(st.isEmpty())? i : i-st.peek()-1;
                int area=width*heights[top];
                maxArea=Math.max(area,maxArea);
                i--;
            }
        }
        return maxArea;

    }
}
