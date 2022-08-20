import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

       int n = Integer.parseInt(br.readLine());
       int ans = 0;

       for (int i=1;i<=n;i*=10) {
           ans += (n-i) +1;
       }

        System.out.println(ans);
    }
}
