import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] sum = new int[n+1];

        st = new StringTokenizer(br.readLine());
        for (int i=1;i<=n;i++){
            sum[i] = sum[i-1]+Integer.parseInt(st.nextToken());
        }

        while (m-->0) {
            st = new StringTokenizer(br.readLine());
            int x= Integer.parseInt(st.nextToken());
            int y= Integer.parseInt(st.nextToken());

            sb.append(sum[y]-sum[x-1]).append('\n');
        }
        System.out.println(sb);
    }
}