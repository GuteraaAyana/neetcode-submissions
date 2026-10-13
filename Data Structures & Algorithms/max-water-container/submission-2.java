class Solution {
    public int maxArea(int[] heights) {
        int start = 0;
        int end = heights.length - 1;
        int max_area = 0;
        while(start < end){
            int bigger = Math.min(heights[start], heights[end]); 
            max_area = Math.max(max_area, (end - start) * bigger);
            if(heights[start] > heights[end]) end--;
            else start++;
        }

        return max_area;
    }
}
