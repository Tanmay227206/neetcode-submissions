class Solution {
    public String simplifyPath(String path) 
    {
        Stack<String> s = new Stack<>();

        String parts[] = path.split("/");

        for(String part : parts)
        {
            if(part.equals("") || part.equals("."))
            {
                continue;
            }
            else if(part.equals(".."))
            {
                if(!s.isEmpty())
                {
                    s.pop();
                }
            }
            else
            {
                s.push(part);
            }

        }

return "/" + String.join("/", s);
        
    }
}