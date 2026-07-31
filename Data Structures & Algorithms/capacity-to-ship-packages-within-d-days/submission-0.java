class Solution {
    public int shipWithinDays(int[] weights, int days) 
    {
        int high = 0;
        int low = 0;

        for(int w:weights)
        {
            low = Math.max(low,w);
            high += w;
        }
        while (low <= high) {

            int mid = (low + high) / 2;

            int sum = 0;
            int count = 1;

            // Check how many days capacity "mid" needs
            for (int w : weights) {

                if (sum + w > mid) {
                    count++;
                    sum = 0;
                }

                sum += w;
            }

            if (count <= days) {
                high = mid - 1;   // works → try smaller
            } else {
                low = mid + 1;    // fails → need bigger
            }
        }

        return low;
        
    }
}