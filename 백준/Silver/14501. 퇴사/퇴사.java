import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        
        int n = Integer.parseInt(br.readLine());
        int[][] work = new int[n][2];

        for (int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            work[i][0] = Integer.parseInt(st.nextToken());
            work[i][1] = Integer.parseInt(st.nextToken());
        }

        int[] dy = new int[n+1];

        for (int i=0;i<n;i++){
            int sum =0;
            if(i+work[i][0] <= n){
                dy[i+work[i][0]] = Math.max(dy[i+work[i][0]],dy[i] + work[i][1]);
            }
            dy[i+1] = Math.max(dy[i+1],dy[i]);
        }

        System.out.println(dy[n]);

    }
}

