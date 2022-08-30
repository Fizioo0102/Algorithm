import java.util.*;
import java.io.*;

public class Main {

    static int r,c,n;
    static char[][] map;
    static int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
    static boolean[][] visit;

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        map = new char[r][c];

        for (int i=0;i<r;i++) {
            String s = br.readLine();
            for (int j=0;j<c;j++){
                map[i][j] = s.charAt(j);
            }
        }

        if(n>=2){
            for (int t=2;t<=n;t++){
                visit = new boolean[r][c];
                if(t%2 ==0){
                    a();
                }
                else {
                    b();
                }
            }
        }

        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                if(map[i][j] == 'R'){
                    map[i][j] = 'O';
                }
                sb.append(map[i][j]);
            }
            sb.append('\n');
        }

        System.out.println(sb);

    }

    static void a() {
        Queue<Integer> q = new LinkedList<>();
        for (int i=0;i<r;i++) {
            for (int j = 0; j < c; j++) {
                if(map[i][j] == 'O'){
                    q.add(i);
                    q.add(j);
                    visit[i][j] = true;
                    map[i][j] = 'R';
                }
                else {
                    map[i][j] = 'O';
                }
            }
        }

        while (!q.isEmpty()) {
            int x = q.poll();
            int y = q.poll();

            for (int i=0;i<4;i++) {
                int nx = x + dir[i][0];
                int ny = y + dir[i][1];

                if(nx<0 || ny<0 || nx>=r || ny>=c) continue;
                if(visit[nx][ny]) continue;

                visit[nx][ny] = true;
                map[nx][ny] = 'R';

            }
        }
    }

    static void b() {
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                if(map[i][j] == 'R'){
                    map[i][j] = '.';
                }
            }
        }
    }

}
