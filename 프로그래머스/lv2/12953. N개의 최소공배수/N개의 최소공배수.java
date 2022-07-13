class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        
        int max = 0;
        for(int i=0;i<arr.length;i++)
            max = Math.max(max,arr[i]);
        
        for(int i=max;i<=Integer.MAX_VALUE;i++) {
            int cnt =0;
            for(int j=0;j<arr.length;j++){
                if(i%arr[j] ==0) cnt++;
            }
            if(cnt == arr.length){
                answer = i;
                break;
            }
        }
        return answer;
    }
}