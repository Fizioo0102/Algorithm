import java.util.*;
import java.io.*;

public class Main {

    static int[][] dir = {{-1,0},{0,-1},{1,0},{0,1}};
    static int r,c,t,uy = 51,dy = -1;
    static int[][] map,dust;
    static boolean[][] visit;

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        /**
         * 미세먼지 4방향 확산 (공기청정기 있는 칸이나 밖은 확산x)
         * -> 4방향 확산양 미세먼지/5 , 원래칸 미세먼지-확산양
         * ->위쪽 공기청정기 = 반시계
         * -> 아래쪽 공기청정기 = 시계
         * -> 바람맞으면 한칸씩 바람방향으로 이동
         * -> 미세먼지가 공기청정기로 들어가면 소멸
         */

        st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        t = Integer.parseInt(st.nextToken());

        map = new int[r][c];
        dust = new int[r][c];

        for (int i=0;i<r;i++){
            st = new StringTokenizer(br.readLine());
            for (int j=0;j<c;j++){
                map[i][j] = Integer.parseInt(st.nextToken());
                dust[i][j] = map[i][j];
            }
        }

        for (int i=0;i<r;i++){
            if(map[i][0] == -1) {
                uy = Math.min(uy,i);
                dy = Math.max(dy,i);
            }
        }

        while (t-->0){
           
            visit = new boolean[r][c];
            spread();
            copy();
            up();
            down();
            clear_dust();


        }

        int sum = 0;
        for (int i=0;i<r;i++) {
            for (int j=0;j<c;j++) {
                sum += map[i][j];
            }
        }

        System.out.println(sum+2);


    }

    static void spread() {
        Queue<Integer> q = new LinkedList<>();

        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                if(map[i][j] >0) {
                    q.add(i);
                    q.add(j);
                }
            }
        }

        while (!q.isEmpty()) {
            int x= q.poll();
            int y= q.poll();

            int z = map[x][y]/5;

            int s = 0;
            for (int i=0;i<4;i++) {
                int nx = x+ dir[i][0];
                int ny = y + dir[i][1];

                if(nx<0 || ny<0 || nx>=r || ny>=c || map[nx][ny] == -1) continue;

                dust[nx][ny] +=z;
               s++;
            }

            dust[x][y] -= (s*z);
        }
    }

    static void copy() {
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                map[i][j] = dust[i][j];
                dust[i][j] = 0;
            }
        }
    }

    static void up() {
        if(c>=2) {
            visit[uy][1] = true;
        }

        for (int i=1;i<c-1;i++){
            dust[uy][i+1] = map[uy][i];
            visit[uy][i+1] = true;
        }

        for (int i=uy;i>=1;i--) {
            dust[i-1][c-1] = map[i][c-1];
            visit[i-1][c-1] = true;
        }

        for (int i=c-1;i>=1;i--){
            dust[0][i-1] = map[0][i];
            visit[0][i-1] = true;
        }

        for (int i=0;i<uy;i++) {
            dust[i+1][0] = map[i][0];
            visit[i+1][0] = true;
            if(i+1 == uy){
                dust[i+1][0] = -1;
            }
        }

    }

    static void down() {
        if(c>=2){
            visit[dy][1] = true;
        }

        for (int i=1;i<c-1;i++){
            dust[dy][i+1] = map[dy][i];
            visit[dy][i+1] = true;
        }

        for (int i=dy;i<r-1;i++){
            dust[i+1][c-1] = map[i][c-1];
            visit[i+1][c-1] = true;
        }

        for (int i=c-1;i>=1;i--){
            dust[r-1][i-1] = map[r-1][i];
            visit[r-1][i-1] = true;
        }

        for (int i=r-1;i>=dy+1;i--){
            dust[i-1][0] = map[i][0];
            visit[i-1][0] = true;

            if(i-1 ==  dy) {
                dust[i-1][0] = -1;
            }
        }
    }

    static void clear_dust() {
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                if(visit[i][j]){
                   map[i][j] =  dust[i][j];

                }
                dust[i][j] = map[i][j];
            }
        }

    }
}