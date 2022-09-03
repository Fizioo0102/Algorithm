import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i=0;i<n;i++){
            int x = Integer.parseInt(br.readLine());
            pq.add(x);
        }
        long ans = 0;

        int cnt = 0 , x =0;
        while (!pq.isEmpty()) {
            if(cnt %2 ==0) {
                x = pq.poll();
            }
             else {
                 x += pq.poll();
                 pq.add(x);
                 ans += x;
            }
             cnt +=1;
        }


        System.out.println(ans);
    }
}