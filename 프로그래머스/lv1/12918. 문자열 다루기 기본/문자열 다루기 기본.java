class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        if(s.length() == 4 || s.length() == 6) answer = true;
        else answer = false;
        
        if(answer == true) {
        for(int i=0;i<s.length();i++) {
            int tmp = Integer.parseInt(String.valueOf(s.charAt(i)-48));
            if(tmp>=0 && tmp<10) continue;
            else answer = false;
             }
        }
        return answer;
    }
}