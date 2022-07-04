class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        String[] map_f = new String[n];
        String[] map_s = new String[n];
        
         for (int i=0;i<n;i++) {
            map_f[i] = "";
             map_s[i] = "";
             answer[i] ="";
         }
        
        //첫번째 맵
        for(int i=0;i<n;i++) {
            String bin = Integer.toBinaryString(arr1[i]);
            if(bin.length()<n) {
                int z = n-bin.length();
                for(int j=0;j<z;j++) {
                    map_f[i] +="0";
                }
            }
                    map_f[i] += bin;
               
            
        }
        
        //두번째맵
         for(int i=0;i<n;i++) {
            String bin = Integer.toBinaryString(arr2[i]);
            if(bin.length()<n) {
                int z = n-bin.length();
                for(int j=0;j<z;j++) {
                    map_s[i] +="0";
                }
            }
                    map_s[i]+=bin;
               
            
        }
        
        
        for(int i=0;i<n;i++) {
            String s ="";
            for(int j=0;j<n;j++) {
                
                if(map_f[i].charAt(j) =='1' || map_s[i].charAt(j)=='1'){
                    answer[i]+="#";
                }
                else{
                    answer[i]+=" ";
                }
            }
            
        }
        return answer;
    }
}