class FreqStack 
{
    HashMap<Integer,Integer> freq = new HashMap<>();
    HashMap<Integer,Stack<Integer>> group = new HashMap<>();
    int maxfreq = 0;
    public FreqStack() 
    {   
    }
    public void push(int val) 
    {
        int f = freq.getOrDefault(val,0)+1;
        freq.put(val,f);

        maxfreq = Math.max(maxfreq,f);
        group.putIfAbsent(f,new Stack<>());
        group.get(f).push(val);
        
    }
    
    public int pop() 
    {
        int val = group.get(maxfreq).pop();
        freq.put(val,freq.get(val)-1);

        if(group.get(maxfreq).isEmpty())
        {
            maxfreq--;
        }
        return val;
        
    }
}