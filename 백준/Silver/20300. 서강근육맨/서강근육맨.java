import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int n = Integer.parseInt(br.readLine());
        long[] x = new long[n];

        st = new StringTokenizer(br.readLine());
        for (int i=0;i<n;i++) {
            x[i] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(x);

        long m = -1;
       if(n%2 == 0) {
           for (int i=0;i<n/2;i++){
               m = Math.max(m,x[i] + x[n-i-1]);
           }

           System.out.println(m);
       }
       else {
           for (int i=0;i<n/2;i++){
               m = Math.max(m,x[i] + x[n-i-2]);
           }

           m = Math.max(m,x[n-1]);
           System.out.println(m);
       }
    }

}
