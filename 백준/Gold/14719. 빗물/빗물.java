import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        Scanner scan = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());

        int[] building = new int[w];

        st = new StringTokenizer(br.readLine());
        for (int i=0;i<w;i++)
            building[i] = Integer.parseInt(st.nextToken());

        int cnt =0;
        for (int i=1;i<=w-2;i++) {
            int left = Integer.MIN_VALUE;
            int right = Integer.MIN_VALUE;
            for (int j=i;j>=0;j--) {
                left = Math.max(left,building[j]);
            }
            for (int j=i;j<=w-1;j++)
                right = Math.max(right,building[j]);

            int min = Math.min(left,right);

            int rain = (min - building[i]);
           if(rain>=0) cnt+= rain;
        }

        System.out.println(cnt);
    }
}