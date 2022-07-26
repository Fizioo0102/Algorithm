class Solution {
    public int solution(int n) {
        int answer = n+1;
        
        String bn = Integer.toBinaryString(n); 
        int ncnt = 0;
        
        for(int i=0;i<bn.length();i++) {
            if(bn.charAt(i) == '1') ncnt++;
        }
        
        for(int i=answer; i<1000001;i++) {
            String bi = Integer.toBinaryString(i);
            int icnt =0;
             for(int j=0;j<bi.length();j++) {
                if(bi.charAt(j) == '1') icnt++;
        }
            if(ncnt == icnt) {
                answer = i;
                break;
            }
            
        }
        return answer;
    }
}