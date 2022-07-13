import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] cut = s.split(" ");
        
       int[] num = new int[cut.length];
        
        for(int i=0;i<cut.length;i++)
            num[i] = Integer.parseInt(cut[i]);
        
        Arrays.sort(num);
        
        answer += String.valueOf(num[0]);
        answer += " ";
        answer += String.valueOf(num[num.length-1]);
        
        return answer;
    }
}