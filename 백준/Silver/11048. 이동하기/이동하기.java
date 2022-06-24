import java.util.*;
import java.io.*;

public class Main {

    static int R,C;
    static int[][] dp;
    

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        Scanner scan = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine());


        R=Integer.parseInt(st.nextToken());
        C=Integer.parseInt(st.nextToken());
        dp=new int[R+1][C+1];
        for(int i=1; i<=R; i++) {
            st =new StringTokenizer(br.readLine());
            for(int j=1; j<=C; j++){ 
                dp[i][j]= Math.max(dp[i-1][j], dp[i][j-1])+Integer.parseInt(st.nextToken());
            } 
        }
        System.out.println(dp[R][C]);
    }
}