class Solution {
    public int largestRectangleArea(int[] heights) 
    {
        Stack<Integer> s = new Stack<>();

        int maxarea = 0;
        for(int i = 0;i <= heights.length;i++)
        {
            int currheight = (i == heights.length)?0:heights[i];

            while(!s.isEmpty() && currheight < heights[s.peek()])
            {
                int height = heights[s.pop()];
                int width;

                if(s.isEmpty())
                {
                    width = i;
                }
                else
                {
                    width = i-s.peek()-1;
                }
                int area = height * width;

                maxarea = Math.max(maxarea,area);
            }
            s.push(i);
        }
        return maxarea;
        
        
    }
}
