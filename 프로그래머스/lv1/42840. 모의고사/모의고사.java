class Solution {
    
    static int[] answer;
    
    public int[] solution(int[] answers) {
        
        int[] one = {1,2,3,4,5};
        int[] two = {2,1,2,3,2,4,2,5};
        int[] three = {3,3,1,1,2,2,4,4,5,5};
        
        int ans1 =0,ans2=0,ans3=0;
        
        for(int i=0;i<answers.length;i++) {
            if(answers[i] == one[i%5]) ans1++;
            if(answers[i] == two[i%8]) ans2++;
            if(answers[i]== three[i%10])ans3++;
        }
        
        if(ans1==ans2&& ans1>ans3){
            answer = new int[2];
            answer[0]=1;
            answer[1]=2;
        }
         
        if(ans1==ans3&& ans1>ans2){
            answer = new int[2];
            answer[0]=1;
            answer[1]=3;
        }
         
        if(ans3==ans2&& ans3>ans1){
            answer = new int[2];
            answer[0]=2;
            answer[1]=3;
        }
         
        if(ans1==ans2&& ans2 == ans3){
            answer = new int[3];
            answer[0]=1;
            answer[1]=2;
            answer[2]=3;
        }
       if(ans1>ans2 && ans1>ans3){
           answer = new int[1];
           answer[0]=1;
       }
        if(ans2>ans1 && ans2>ans3){
           answer = new int[1];
           answer[0]=2;
       }
        if(ans3>ans2 && ans3>ans1){
           answer = new int[1];
           answer[0]=3;
       }
        
        
        return answer;
    }
}