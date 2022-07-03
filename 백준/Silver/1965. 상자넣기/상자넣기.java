import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int max = 0;
        int[] box = new int[n+1];
        int[] dp = new int[n+1];

        for (int i=1;i<=n;i++)
            box[i] = scan.nextInt();

        for (int i=1;i<=n;i++) {
            dp[i]= 1;
            for (int j=1;j<i;j++) {
                if(box[j] < box[i] && dp[i]<dp[j]+1)
                    dp[i] = dp[j]+1;
            }

            max = Math.max(max,dp[i]);
        }
        System.out.println(max);
    }
}