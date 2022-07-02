import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String s = String.valueOf(n);
        char[] num = new char[s.length()];
        
        for(int i=0;i<s.length();i++)
            num[i] = s.charAt(i);
        
        Arrays.sort(num);
        String ans = "";
        
        for(int i=s.length()-1;i>=0;i--) {
            ans += String.valueOf(num[i]);
        }
        
        answer = Long.parseLong(ans);
        
        return answer;
    }
}