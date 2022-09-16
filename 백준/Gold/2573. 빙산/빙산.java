import java.util.*;
import java.io.*;

public class Main {

    static int n,m;
    static int[][] map,bing;
    static int[][] dir = {{1,0},{0,1},{-1,0},{0,-1}};
    static boolean[][] visit;

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][m];
        bing = new int[n][m];

        for (int i=0;i<n;i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<m;j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int time = 0; boolean check = false;
        while (true) {
            visit = new boolean[n][m];
            melt();
            copy();
            int island = 0;
            check =false;
            for (int i=0;i<n;i++) {
                for (int j=0;j<m;j++) {
                    if(!visit[i][j] && map[i][j] !=0) {

                        bfs(i,j);
                        island++;
                        check = true;
                    }
                }
            }
//            for (int i=0;i<n;i++){
//                for (int j=0;j<m;j++){
//                    System.out.print(map[i][j] + " ");
//                }
//                System.out.println();
//            }
//            System.out.println(island);
            time++;
            if(island>1 || check == false) break;
        }

        int z_cnt =0;
        for (int i=0;i<n;i++) {
            for (int j=0;j<m;j++) {
                if(map[i][j] ==0) z_cnt++;
            }
        }
        if(z_cnt == n*m) System.out.println(0);
        else System.out.println(time);




    }

    static void melt() {
        for (int i=0;i<n;i++) {
            for (int j=0;j<m;j++) {
                if(map[i][j] != 0) {
                    int cnt =0;
                    for (int k=0;k<4;k++) {
                        int nx = i + dir[k][0];
                        int ny = j + dir[k][1];

                        if(nx<0 || ny<0 || nx>=n || ny>=m) continue;
                        if(map[nx][ny] == 0) cnt++;
                    }
                    bing[i][j] = map[i][j]-cnt;
                    if(bing[i][j] <=0) bing[i][j] = 0;
                }
            }
        }
    }

    static void copy() {
        for (int i=0;i<n;i++) {
            for (int j=0;j<m;j++) {
                map[i][j] = bing[i][j];
                bing[i][j] = 0;
            }
        }
    }

    static void bfs(int x, int y) {
        Queue<Integer> q = new LinkedList<>();
        q.add(x);
        q.add(y);
        visit[x][y] = true;

        while (!q.isEmpty()) {
            x = q.poll();
            y = q.poll();

            for (int i=0;i<4;i++) {
                int nx = x+dir[i][0];
                int ny = y+ dir[i][1];

                if(nx<0 || ny<0 || nx>=n || ny>=m) continue;
                if(visit[nx][ny]) continue;
                if(map[nx][ny] ==0) continue;

                q.add(nx);
                q.add(ny);
                visit[nx][ny] = true;
            }
        }
    }

}