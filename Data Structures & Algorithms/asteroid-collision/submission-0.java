class Solution {
    public int[] asteroidCollision(int[] asteroids) 
    {
        Stack<Integer> s = new Stack<>();

        for(int asteroid : asteroids)
        {
            boolean destroyed =false;

            while(!s.isEmpty() && s.peek() > 0 && asteroid < 0)
            {
                if(s.peek() < - asteroid)
                {
                    s.pop();
                }

                else if(s.peek() == -asteroid)
                {
                    s.pop();
                    destroyed = true;
                    break;
                }
                else
                {
                     destroyed = true;
                    break;
                }
                
            }
            if(!destroyed)
            {
                s.push(asteroid);
            }
            } 
        

        int result[] = new int [s.size()];
        for(int i = s.size()-1;i >=0 ;i--)
        {
            result[i] = s.pop();
        }
        return result;



}


        
    }
