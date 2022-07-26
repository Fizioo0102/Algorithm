import java.util.*;

class Solution
{
    public int solution(String s)
    {
        int answer = -1;

       Stack<String> st = new Stack<>();
        
        for(int i=0;i<s.length();i++) {
            if(st.isEmpty()){
                st.push(String.valueOf(s.charAt(i)));
            }
            else {
                   if(st.peek().equals(String.valueOf(s.charAt(i)))){
                        st.pop();
                    }
                    else {
                        st.push(String.valueOf(s.charAt(i)));
                    }
                }
            }
        
        
       
        if(st.isEmpty()) answer = 1;
        else answer = 0;

        return answer;
    }
}