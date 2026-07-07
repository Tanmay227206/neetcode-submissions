class Solution {
    public int largestRectangleArea(int[] heights) 
    {
        int maxarea = 0;
        for(int i = 0;i < heights.length;i++)
        {
            int minheight = heights[i];

            for(int j = i;j < heights.length;j++)
            {
                minheight = Math.min(minheight,heights[j]);

                int width = j - i +1;

                int area = minheight * width;

                maxarea = Math.max(maxarea,area);
            }
        }
        return maxarea;
        
    }
}
