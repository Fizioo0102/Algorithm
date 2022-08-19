import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
       long[] len = new long[n-1];
        for (int i=0;i<n-1;i++){
            len[i] = Long.parseLong(st.nextToken());
        }
        long[] oil = new long[n];
        st = new StringTokenizer(br.readLine());
        for (int i=0;i<n;i++){
            oil[i] = Long.parseLong(st.nextToken());
        }

        long min = oil[0];
        long sum = oil[0]*len[0];


        for (int i=1;i<n-1;i++){
            min = Math.min(min,oil[i]);
            sum += (min*len[i]);
        }

        System.out.println(sum);
    }
}

