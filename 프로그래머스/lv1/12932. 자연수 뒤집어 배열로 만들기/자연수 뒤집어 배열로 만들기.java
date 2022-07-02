import java.util.*;

class Solution {
    public int[] solution(long n) {
         String s = String.valueOf(n);
        
        int[] answer = new int[s.length()];
        
       char[] num = new char[s.length()];
        
        for(int i=0;i<s.length();i++) {
            num[i] = s.charAt(i);
        }
        
        int j =0;
        for(int i=s.length()-1;i>=0;i--) {
            answer[j] = Integer.parseInt(String.valueOf(num[i]));
            j++;
        }
        
       
        return answer;
    }
}