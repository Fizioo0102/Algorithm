class Solution {
    public String solution(String s) {
        String answer = "";
        
        int idx = 0;
        
      
       for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ' '){
                idx = 0;
                answer += " ";
                
            }
            
            else if(idx %2 ==0) {
                if(s.charAt(i) >='a' && s.charAt(i)<='z') {
                int a =s.charAt(i)-32;
                    answer+=String.valueOf((char)a);
                    idx++;
                    
                }
                
                else {
                     answer+=String.valueOf(s.charAt(i));
                    idx++;
                   
                }
                   
               
            }
           else if(idx%2 ==1) {
                if(s.charAt(i) >='a' && s.charAt(i)<='z') {
                    answer +=String.valueOf(s.charAt(i));
                    idx++;
                  
                } 
               
                else{
                    int a =s.charAt(i)+32;
                    answer+=String.valueOf((char)a);
                    idx++;
                    
                }
                  
            }
        }
        return answer;
    }
}