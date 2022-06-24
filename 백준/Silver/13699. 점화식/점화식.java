import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        Scanner scan = new Scanner(System.in);

       int n = scan.nextInt();

      long[] dp = new long[36];

       dp[0] = 1;
       dp[1] = 1;

       for (int i=2;i<36;i++) {
           for (int j=0;j<i;j++) {
               dp[i] += (dp[j]*dp[i-1-j]);
           }
       }

           System.out.println(dp[n]);

    }
}
