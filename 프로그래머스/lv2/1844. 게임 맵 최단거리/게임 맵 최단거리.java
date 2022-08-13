import java.util.*;

class Solution {
    
    static int[][] dir = {{1,0},{0,1},{-1,0},{0,-1}};
    static int[][] dist;
    static int n,m;
    
    public int solution(int[][] maps) {
        int answer = 0;
        n = maps.length;
        m = maps[0].length;
        dist = new int[n][m];
        
        bfs(0,0,maps);
        
        answer = dist[n-1][m-1];
        
        
        return answer;
    }
    
    static void bfs(int x, int y, int[][] maps){
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                dist[i][j] = -1;
            }
        }
        
        q.add(x);
        q.add(y);
        dist[x][y] = 1;
        
        while(!q.isEmpty()){
            x = q.poll();
            y = q.poll();
            
            for(int i=0;i<4;i++){
                int nx = x + dir[i][0];
                int ny = y + dir[i][1];
                
                if(nx<0 || ny<0 || nx>=n || ny>=m) continue;
                if(dist[nx][ny] != -1) continue;
                if(maps[nx][ny] == 0) continue;
                
                q.add(nx);
                q.add(ny);
                dist[nx][ny] = dist[x][y]+1;
            }
        }
    }
}