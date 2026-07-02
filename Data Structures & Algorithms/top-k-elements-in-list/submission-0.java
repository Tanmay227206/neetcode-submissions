class Solution {
    public int[] topKFrequent(int[] nums, int k) 
    {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0;i < nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

        }
        int[] result = new int[k];

        for(int i = 0;i < k;i++)
        {
            int maxfreq = 0;
            int element = 0;

            for(Integer Key:map.keySet())
            {
                if(map.get(Key)>maxfreq)
                {
                    maxfreq = map.get(Key);
                    element = Key;
                }

            }
            result[i] = element;
            map.remove(element);
        }
        return result;
        
    }
}
