class Solution {
    public String solution(String s) {
        String answer = "";
        
       
        String[] cut = s.split(" ");
        
        for(int i=0;i<cut.length;i++) {
            String str = cut[i];
            for(int j=0;j<str.length();j++) {
                if(j==0) { 
                     if(str.charAt(j)>='0'&& str.charAt(j) <='9'  )
                        answer+=String.valueOf(str.charAt(j));
                   else if (str.charAt(j)>='A'&& str.charAt(j) <='Z')
                        answer+=String.valueOf(str.charAt(j));
                    else {
                        String a = String.valueOf(str.charAt(j));
                        answer += a.toUpperCase();
                    }
                        
                }
                
                else {
                     String a = String.valueOf(str.charAt(j));
                        answer += a.toLowerCase();
                }
                    
            }
            
            if(i<cut.length-1)
                 answer += " ";
        }
        
        if(s.charAt(s.length()-1) ==' ') answer += " ";
        return answer;
    }
}