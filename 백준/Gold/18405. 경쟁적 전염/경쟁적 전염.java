import java.util.*;
import java.io.*;

public class Main {

    static class pair {
        int x,y;

        public pair(int x, int y) {
            this.x = x;
            this.y =y;
        }
    }

    static int n,k,s,x,y;
    static int[][] map;
    static int[][] dir = {{1,0},{0,1},{-1,0},{0,-1}};
    static boolean[][] visit;

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        Scanner scan = new Scanner(System.in);

       n = scan.nextInt();
       k = scan.nextInt();
       map = new int[n+1][n+1];
       visit = new boolean[n+1][n+1];

       for (int i=1;i<=n;i++)
           for (int j=1;j<=n;j++)
               map[i][j] = scan.nextInt();

       s = scan.nextInt();
       x = scan.nextInt();
       y = scan.nextInt();

       loop:
       for (int i=0;i<s;i++) {
           for (int j=0;j<k;j++) {
               bfs(j+1);

               if(map[x][y] !=0) break loop;
           }
       }

        System.out.println(map[x][y]);

    }

    static void bfs(int v) {
        Queue<pair> q = new LinkedList<>();

        for (int i=1;i<=n;i++) {
            for (int j=1;j<=n;j++) {
                if(map[i][j] == v ) {
                    q.add(new pair(i,j));
                }
            }
        }

        while (!q.isEmpty()) {
            pair p = q.poll();

            for (int i=0;i<4;i++) {
                int nx = p.x + dir[i][0];
                int ny = p.y + dir[i][1];


                if(nx<1 && ny <1 || nx>n || ny>n) continue;
                if(map[nx][ny] != 0) continue;

                map[nx][ny] = v;
            }
        }
    }
}

