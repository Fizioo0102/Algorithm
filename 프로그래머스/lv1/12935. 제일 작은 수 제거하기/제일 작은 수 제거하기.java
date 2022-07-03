import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
                                                             
        int min = Integer.MAX_VALUE;
        
        if(arr.length == 1) {
            int[] answer = {-1};
            return answer;
        }
        
        int[] answer = new int[arr.length-1];
        
        for(int i=0;i<arr.length;i++)
            min = Math.min(min,arr[i]);
        
        int j =0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] == min) continue;
            else {
                answer[j] = arr[i];
                j++;
}
        }
        
        return answer;
    }
}