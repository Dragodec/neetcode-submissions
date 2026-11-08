class Solution {
    public int maxArea(int[] heights) {
        int maximumArea = 0;
        int left = 0;
        int right = heights.length - 1;
        while(left < right)
        {
            int area = 0;
            int width = right - left;
            area = width * Math.min(heights[left], heights[right]);
            maximumArea = Math.max(area, maximumArea);

            if(heights[left] < heights[right])
            left++;
            else
            right--;
        }
        return maximumArea;
    }
}
