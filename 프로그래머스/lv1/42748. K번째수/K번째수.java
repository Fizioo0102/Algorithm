import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
     for(int i=0;i<commands.length;i++) {
         int a = commands[i][0];
         int b = commands[i][1];
         int c = commands[i][2];
         
         int[] temp = new int[b-a+2];
         int idx =1;
         for(int j=a-1;j<b;j++){
             temp[idx] = array[j];
             idx++;
         }
         
         Arrays.sort(temp);
         
         answer[i] = temp[c];
     }
        return answer;
    }
}