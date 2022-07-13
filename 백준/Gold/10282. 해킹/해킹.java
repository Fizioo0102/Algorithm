import java.util.*;
import java.io.*;

public class Main {

    static class com {
        public int to,w;

        public com(int to, int w) {
            this.to =to;
            this.w = w;
        }
    }

    static class information {
        public int idx, dist;

        public information(int idx, int dist){
            this.idx = idx;
            this.dist = dist;
        }
    }

    static int n,d,c;
    static ArrayList<com>[] adj;
    static int[] dist;

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        Scanner scan = new Scanner(System.in);

        int t =scan.nextInt();

        while (t-->0) {

            n = scan.nextInt();
            d = scan.nextInt();
            c = scan.nextInt();

            dist = new int[n+1];
          adj = new ArrayList[n+1];

          for (int i=1;i<=n;i++)
              adj[i] = new ArrayList<>();

          for (int i=0;i<d;i++){
              int a = scan.nextInt();
              int b = scan.nextInt();
              int s = scan.nextInt();

              adj[b].add(new com(a,s));
          }

          dijkstra(c);
          int cnt =0;
          int res = 0;

          for (int i=1;i<=n;i++){
              if(dist[i] != Integer.MAX_VALUE){
                  cnt++;
                  res = Math.max(res,dist[i]);
              }
          }
          System.out.println(cnt + " " + res);
        }
    }

    static void dijkstra(int x) {
        for (int i=1;i<=n;i++) dist[i] = Integer.MAX_VALUE;

        PriorityQueue<information> pq = new PriorityQueue<>((o1,o2) -> o1.dist - o2.dist);

        pq.add(new information(x,0));
        dist[x] = 0;


        while (!pq.isEmpty()) {
            information info = pq.poll();

            if(dist[info.idx] != info.dist) continue;

            for (com c: adj[info.idx]) {
                if(dist[info.idx] + c.w >= dist[c.to]) continue;

                dist[c.to] = dist[info.idx] + c.w;
                pq.add(new information(c.to, dist[c.to]));

            }
        }
    }
}