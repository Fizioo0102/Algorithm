class Solution {
    public int solution(String d) {
        int answer = 0;
        
        int[] score = new int[4];
        int idx = 0;
        
        
        for(int i=0;i<d.length();i++) {
            if(d.charAt(i)-'0' == 1 && d.charAt(i+1)-'0' == 0) {
                idx++;
                    i+=2;
                    score[idx]=10;
                
            }
            if(d.charAt(i)-'0'>=0 && d.charAt(i)-'0'<=9){
                idx++;
                score[idx] = d.charAt(i)-'0';
                
            }
            
            switch(d.charAt(i)){
                case 'S':
                    score[idx] = score[idx];
                    break;
                case 'D':
                    score[idx] = score[idx]*score[idx];
                    break;
                case 'T':
                    score[idx] = score[idx]*score[idx]*score[idx];
                    break;
                case '*':
                    score[idx] = score[idx]*2;
                    score[idx-1] = score[idx-1]*2;
                    break;
                case '#':
                    score[idx] = score[idx]*(-1);
                    break;
                default:
                    break;
                    
            }
        }
        
        for(int e : score) answer+=e;
            

        return answer;
    }
}