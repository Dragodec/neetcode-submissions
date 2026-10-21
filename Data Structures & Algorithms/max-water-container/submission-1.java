class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int maxArea = 0;
        while(left < right)
        {
            int area = 1;
            int width = right - left;
            area = Math.min(heights[left], heights[right]) * width;
            if(heights[left] < heights[right]){
                left++;
            }
            else
            {
                right--;
            }
            if(area > maxArea)
            maxArea = area;
        }
        return maxArea;
    }
}
