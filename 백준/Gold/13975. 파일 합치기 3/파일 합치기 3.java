import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int tc = Integer.parseInt(br.readLine());

        while (tc-->0) {
            int n = Integer.parseInt(br.readLine());
            PriorityQueue<Long> pq = new PriorityQueue<>();

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                pq.add(Long.parseLong(st.nextToken()));
            }


            Long cost = 0L;

            while (pq.size()>1) {
                Long x = pq.poll();
                Long y = pq.poll();

                cost += (x+y);
                pq.add(x+y);
            }

            System.out.println(cost);
        }


    }

}