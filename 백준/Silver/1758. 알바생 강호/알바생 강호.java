import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int n = Integer.parseInt(br.readLine());
       Integer[] p = new Integer[n];
        
        for (int i=0;i<n;i++){
            p[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(p,Collections.reverseOrder());

        long t = 0;

        for (int i=0;i<n;i++) {
            int tip = p[i] - i;

            if(tip<0) tip = 0;

            t += tip;
        }

        System.out.println(t);
    }
}