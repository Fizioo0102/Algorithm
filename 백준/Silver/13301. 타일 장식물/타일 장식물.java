import java.util.*;
import java.io.*;

public class Main {


    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        long[] dp = new long[n+5];

        dp[1] = 4;
        dp[2] =6;

        if(n>=3) {
            for (int i=3;i<=n;i++) {
                dp[i] = dp[i-1] + dp[i-2];
            }
        }

        System.out.println(dp[n]);

    }
}