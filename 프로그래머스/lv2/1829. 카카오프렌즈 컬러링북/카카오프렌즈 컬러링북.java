import java.util.*;

class Solution {
    
    static int cnt;
    static boolean[][] visit;
    static int[][] dir = {{1,0},{0,1},{-1,0},{0,-1}};
    
    public int[] solution(int m, int n, int[][] picture) {
       
        ArrayList<Integer> arr = new ArrayList<>();
        visit = new boolean[m][n];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(picture[i][j] != 0 && !visit[i][j]){
                    cnt =0;
                    bfs(n,m,picture,i,j);
                    arr.add(cnt);
                }
            }
        }
        
        Collections.sort(arr);

        int[] answer = new int[2];
        answer[0] = arr.size();
        answer[1] = arr.get(arr.size()-1);
        return answer;
    }
    
    static void bfs(int n, int m ,int[][] map,int x, int y){
        Queue<Integer> q = new LinkedList<>();
    
        q.add(x);
        q.add(y);
        visit[x][y] = true;
        
        
        while(!q.isEmpty()){
            x = q.poll();
            y = q.poll();
            cnt++;
            
            for(int i=0;i<4;i++){
                int nx = x + dir[i][0];
                int ny = y + dir[i][1];
                
                if(nx<0 || ny<0 || nx>=m || ny>=n) continue;
                if(map[nx][ny] == 0) continue;
                if(visit[nx][ny]) continue;
                if(map[x][y] != map[nx][ny]) continue;
                
                q.add(nx);
                q.add(ny);
                visit[nx][ny] = true;
                
            }
        }
       
    }
}