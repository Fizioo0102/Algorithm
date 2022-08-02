class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        for(int i=0;i<sizes.length;i++) {
            int temp = sizes[i][0];
            if(sizes[i][0] < sizes[i][1]){
                sizes[i][0] = sizes[i][1];
                sizes[i][1] =temp;
            }
        }
        
        int w = Integer.MIN_VALUE;
            int h = Integer.MIN_VALUE;
        for(int i=0;i<sizes.length;i++) {
            w = Math.max(w,sizes[i][0]);
            h = Math.max(h,sizes[i][1]);
        }
        
        answer = w*h;
        return answer;
    }
}