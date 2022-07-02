import java.util.*;
import java.io.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] alpha = new String[s.length()];
        
        for(int i=0;i<s.length();i++)
            alpha[i] = String.valueOf(s.charAt(i));
        
        Arrays.sort(alpha,Collections.reverseOrder());
        
        for(int i=0;i<s.length();i++)
            answer+=alpha[i];
        
        return answer;
    }
}