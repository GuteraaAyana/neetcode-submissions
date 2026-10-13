class Solution {
    public int maxArea(int[] heights) {
        int start = 0;
        int end = heights.length - 1;
        int max_area = 0;
        int bigger;
        while(start < end){
            if(heights[start] < heights[end]) bigger = heights[start]; 
            else bigger = heights[end];
            int curr_area = (end - start) * bigger;
            if(curr_area > max_area) max_area = curr_area;
            if(heights[start] > heights[end]) end--;
            else start++;
        }

        return max_area;
    }
}
