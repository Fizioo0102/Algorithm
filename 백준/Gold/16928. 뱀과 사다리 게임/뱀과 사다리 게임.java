import java.io.*;
import java.util.*;

public class Main {

    static int n,m;
    static int[] a ,dist;
    static boolean[] visit;

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
       a = new int[101];
       dist = new int[101];
       visit = new boolean[101];

        for (int i=0;i<n+m;i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            a[x] = y;
        }

        bfs(1);

    }

    static void bfs(int x) {
        Queue<Integer> q = new LinkedList<>();
        for (int i=0;i<101;i++) dist[i] = Integer.MAX_VALUE;

        q.add(x);
        visit[x] = true;
        dist[x] = 0;

        while (!q.isEmpty()) {
            x = q.poll();

            if(x == 100 ) {
                System.out.println(dist[x]);
                return;
            }
            for (int i=1;i<=6;i++) {
                int nx = x + i;

                if(nx>100) continue;
                if(visit[nx]) continue;

                    if (a[nx] != 0) {
                        nx = a[nx];

                }

                q.add(nx);
                visit[nx] = true;
                dist[nx] = Math.min(dist[nx],dist[x]+1 );
            }
        }
    }


}