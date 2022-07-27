import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        Scanner scan = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;


        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        int[] water = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++)
            water[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(water);
        int tape = l - 1;
        int ans = 1;


        if (tape == 0) ans = n;
        else {
            int idx = 0;
            for (int i = 1; i < n ; i++) {
                if((water[i]-water[idx]) <= tape) continue;
                else {
                    ans++;
                    idx = i;
                }
            }
        }

        System.out.println(ans);
    }
}