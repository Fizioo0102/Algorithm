class Solution {
    public String solution(int a, int b) {
        String answer = "";
        
        int[] day = {0,31,29,31,30,31,30,31,31,30,31,30};
        String[] week = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
        
        int sum =0;
        
            for(int i=1;i<=a;i++) {
                sum+=day[i-1];
            }
            sum+=b;
        
        answer += week[sum%7];
        return answer;
    }
}