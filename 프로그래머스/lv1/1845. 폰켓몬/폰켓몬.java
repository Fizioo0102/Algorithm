import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        Arrays.sort(nums);
        
        int h = nums.length/2;
        
        HashSet<Integer> hs = new HashSet<>();
        hs.add(nums[0]); h--;
        
        for(int i=1;i<nums.length;i++){
            if(h==0) break;
            
            if(nums[i] != nums[i-1]){
                hs.add(nums[i]);
                h--;
            }
        }
        
        answer = hs.size();
        return answer;
    }
}