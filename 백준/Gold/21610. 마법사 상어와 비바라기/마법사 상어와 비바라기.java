import java.util.*;
import java.io.*;

public class Main {

    static int[][] dir = {{0,-1},{-1,-1},{-1,0},{-1,1},
            {0,1},{1,1},{1,0},{1,-1}};
    static int[][] wb = {{-1,-1},{-1,1},{1,1},{1,-1}};
    static int n,m;
    static int[][] map,cloud;
    static boolean[][] visit;

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        /**
         * 초기구름상태 -> 구름이동 -> 비오고 구름사라짐 ( 물 +1 증가)
         * -> 구름이 사라진 칸 표시 -> 비온 칸에 물복사 버그 ->
         * 물복사 구역 제외 후 새 구름 생성 -> 새구름 칸 2씩 감소
         */

        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][n];
        cloud = new int[n][n];

        for (int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            for (int j=0;j<n;j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        cloud[n-2][1] = 1; cloud[n-2][0] = 1;
        cloud[n-1][1] = 1; cloud[n-1][0] = 1;

        for (int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());
             int d = Integer.parseInt(st.nextToken());
             int s = Integer.parseInt(st.nextToken());
             visit = new boolean[n][n];
                cloud_move(d,s);
                rain();
                water_bug();
                new_cloud();

        }

        int sum =0;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
               sum += map[i][j];
            }
        }

        System.out.println(sum);


    }

    static void cloud_move(int d, int s) {

        Queue<Integer> q = new LinkedList<>();
        for (int tc=1;tc<=s;tc++){
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (cloud[i][j] == 1) {
                        q.add(i);
                        q.add(j);
                        cloud[i][j] = 0;
                    }
                }
            }
                    while (!q.isEmpty()){
                        int x = q.poll();
                        int y = q.poll();

                        int nx = x + dir[d-1][0];
                        int ny = y + dir[d-1][1];

                        if (nx >= n) {
                            nx -= n;
                        }
                        if (ny >= n) {
                            ny -= n;
                        }
                        if (nx < 0) {
                            nx = n - Math.abs(nx);
                        }
                        if (ny < 0) {
                            ny = n - Math.abs(ny);
                        }

//                        System.out.print(nx +" "+ ny +'\n');
                        cloud[nx][ny] = 1;
                        if(tc==s){
                            visit[nx][ny] = true;
                        }

                    }
//
//            for (int i=0;i<n;i++){
//                for(int j=0;j<n; j++){
//                    System.out.print(cloud[i][j]+" ");
//                }
//                System.out.println();
//            }
        }

    }

    static void rain() {
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if(cloud[i][j] == 1) {
                    map[i][j] = map[i][j]+1;
                }
            }
        }
    }

    static void water_bug() {
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++) {
                if(visit[i][j]){
                    int cnt =0;
                    for (int k=0;k<4;k++){
                        int nx = i + wb[k][0];
                        int ny = j + wb[k][1];

                        if(nx<0 || ny<0 || nx>=n || ny>=n) continue;

                        if(map[nx][ny]>0) cnt++;
                    }

                    cloud[i][j] =0;
                    map[i][j] +=cnt;
                }
            }
        }
    }

    static void new_cloud() {
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if(visit[i][j]) continue;

                if(map[i][j]>=2) {
                    cloud[i][j] =1;
                    map[i][j] -=2;
                }
            }
        }
    }


}
