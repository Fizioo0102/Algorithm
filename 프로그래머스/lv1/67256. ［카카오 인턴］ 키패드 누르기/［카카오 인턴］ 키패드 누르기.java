class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int[][] h = {{3,1},{0,0},{0,1},{0,2},{1,0},{1,1},{1,2},{2,0},{2,1},{2,2},{3,0},{3,2}};
        
        int lh =10 ,rh =11;
        
        for(int i=0;i<numbers.length;i++) {
            if(numbers[i]==1||numbers[i]==4||numbers[i]==7) {
                answer+="L";
                lh = numbers[i];
            }
            if(numbers[i]==3||numbers[i]==6||numbers[i]==9) {
                answer+="R";
                rh = numbers[i];
            }
            if(numbers[i]==2 || numbers[i]==5 || numbers[i]==8 || numbers[i]==0) {
                int ld = (Math.abs(h[lh][0]-h[numbers[i]][0])+Math.abs(h[lh][1]-h[numbers[i]][1]));
                int rd = (Math.abs(h[rh][0]-h[numbers[i]][0])+Math.abs(h[rh][1]-h[numbers[i]][1]));
                
                if(ld<rd) {
                    lh =numbers[i];
                    answer+="L";
                }
                if(rd<ld) {
                    rh = numbers[i];
                    answer+="R";
                }
                if(ld==rd) {
                    if(hand.equals("left")){
                        lh = numbers[i];
                        answer+="L";
                    }
                    if(hand.equals("right")){
                        rh = numbers[i];
                        answer+="R";
                    }
                }
            }
            
                               
        }
        
        return answer;
    }
}