import java.util.*;
import java.io.*;

public class Main {

    static int[][] dir = {{1,0},{0,1},{-1,0},{0,-1}};
    static boolean[][] visit;
    static int n,m;

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        Scanner scan = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        st=  new StringTokenizer(br.readLine());
         n = Integer.parseInt(st.nextToken());
         m = Integer.parseInt(st.nextToken());

         int ans = 0;
        int[][] map = new int[n][m];
        visit = new boolean[n][m];

        for (int i=0;i<n;i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0;j<m;j++) {
                int r = Integer.parseInt(st.nextToken());
                int g = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                int avg = (r+g+b)/3;
                map[i][j] = avg;
            }
        }

        int t = Integer.parseInt(br.readLine());

        for (int i=0;i<n;i++) {
            for (int j=0;j<m;j++) {
                if(map[i][j] >= t){
                    map[i][j] = 255;
                }
                else
                    map[i][j] = 0;
            }
        }

        for (int i=0;i<n;i++) {
            for (int j=0;j<m;j++) {
                if(!visit[i][j] && map[i][j] == 255) {
                    bfs(i,j,map);
                    ans++;
                }
            }
        }

        System.out.println(ans);


    }

    static void bfs(int x,int y,int[][] map) {
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

                if(nx<0 || ny<0 || nx>=n || ny>=m) continue;
                if(visit[nx][ny]) continue;
                if(map[nx][ny] == 0) continue;

                q.add(nx);
                q.add(ny);
                visit[nx][ny] = true;

            }
        }

    }
}