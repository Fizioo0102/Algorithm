import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int n = Integer.parseInt(br.readLine());

        int[][] p = new int[n][2];
        long sum = 0;
        for (int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            p[i][0] = Integer.parseInt(st.nextToken());
            p[i][1] = Integer.parseInt(st.nextToken());
            sum += p[i][1];
        }

        Arrays.sort(p, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        long half = (sum+1)/2;
        long w = 0; int ans =0;
        for (int i=0;i<n;i++) {

            w += p[i][1];
            if(w>=half) {
                ans = i;
                break;
            }

        }

        System.out.println(p[ans][0]);
    }

}