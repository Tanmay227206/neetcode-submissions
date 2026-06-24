class Solution {
    public int maxArea(int[] heights) 
    {
        int left =0 ;
        int right = heights.length - 1;
        int maxarea = 0;

        while(left < right)
        {
            int width = right-left;
            int heightof = Math.min(heights[left],heights[right]);
            int area = width * heightof;
            maxarea = Math.max(area,maxarea);
            if(heights[left] < heights[right])
            {
                left++;
            }
            else
            {
                right--;
            }

        }
         return maxarea; 

    }   
    
}
