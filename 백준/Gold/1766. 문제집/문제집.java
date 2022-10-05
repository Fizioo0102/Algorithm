import java.util.*;
import java.io.*;

public class Main {

    static int n,m;
    static int[] ind;
    static ArrayList<Integer>[] adj;

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        adj = new ArrayList[n+1];
        ind = new int[n+1];

        for (int i=1;i<=n;i++){
            adj[i] = new ArrayList<>();
        }

        for (int i=0;i<m;i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            adj[x].add(y);
            ind[y]++;
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i=1;i<=n;i++){
            if(ind[i] ==0) {
                pq.add(i);
            }
        }


        while (!pq.isEmpty()) {
            int q = pq.poll();
            sb.append(q).append(' ');

            for (int t: adj[q]){
              ind[t]--;

              if(ind[t] ==0){
                  pq.add(t);
              }
                }

        }

        System.out.println(sb);

    }
}