class Solution {
    public int maxArea(int[] heights) {
        int start = 0;
        int end = heights.length - 1;
        int max_area = 0;
        while(start < end){
            int bigger_wall = (heights[start] < heights[end]) ? heights[start] : heights[end];
            int curr_area = (end - start) * bigger_wall;
            if(curr_area > max_area) max_area = curr_area;
            if(heights[start] > heights[end]) end--;
            else start++;
        }

        return max_area;
    }
}
