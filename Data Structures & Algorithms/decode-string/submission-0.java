class Solution {
    public String decodeString(String s) 
    {
        Stack<Integer> numstack = new Stack<>();

        Stack<String> strstack = new Stack<>();

         String curr = "";
         int num = 0;

         for(char ch :s.toCharArray())
         {
            if(Character.isDigit(ch))
            {
                num = num * 10 + (ch - '0');
            }

            else if(ch == '[')
            {
                numstack.push(num);
                strstack.push(curr);

                num = 0;
                curr = "";
            }

            else if(ch == ']')
            {
                int count = numstack.pop();
                String prev = strstack.pop();
                String temp = "";
                for(int i = 0;i < count;i++)
                {
                    temp += curr;
                }
                curr = prev + temp;
            }
            else
            {
                curr += ch;
            }
    
         }
         return curr;
        
    }
}