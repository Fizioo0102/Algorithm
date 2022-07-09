import java.util.*;
import java.io.*;

public class Main {

   static int n,max,cnt;
   static int[][] map;
   static boolean[][] visit;
   static int[][] dir = {{1,0},{0,1},{-1,0},{0,-1}};

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        n =scan.nextInt();
        map = new int[n][n];
        max = Integer.MIN_VALUE;

        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                map[i][j] = scan.nextInt();
                max = Math.max(max,map[i][j]);
            }
        }

        int ans = 0;

        for (int k=0;k<=max;k++) {
            visit = new boolean[n][n];
            cnt =0;
            for (int i=0;i<n;i++) {
                for (int j=0;j<n;j++) {
                    if(map[i][j] > k && !visit[i][j] ){
                        bfs(i,j,k);
                        cnt++;
                    }
                }
            }
            ans = Math.max(ans,cnt);
        }

        System.out.println(ans);

    }

    static void bfs(int x,int y, int rain) {
        Queue<Integer> q = new LinkedList<>();
        q.add(x);
        q.add(y);
        visit[x][y] = true;

        while (!q.isEmpty()) {
            x = q.poll();
            y = q.poll();

            for (int i=0;i<4;i++) {
                int nx = x + dir[i][0];
                int ny = y + dir[i][1];

                if(nx<0 || ny <0 || nx >=n || ny>=n) continue;
                if(visit[nx][ny])continue;
                if(map[nx][ny] <= rain) continue;

                q.add(nx);
                q.add(ny);
                visit[nx][ny] = true;
            }
        }
    }
}