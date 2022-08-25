import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i=0;i<scoville.length;i++){
            pq.add(scoville[i]);
        }
        
        while(true){
            if(pq.peek()>=K) break;
            
            if(pq.size()<=1 && pq.peek()<K){
                answer = -1;
                break;
            }
            
            else {
                int x = pq.poll();
                int y = pq.poll();
                
                pq.add(x+(y*2));
                answer++;
            }
        }
        return answer;
    }
}