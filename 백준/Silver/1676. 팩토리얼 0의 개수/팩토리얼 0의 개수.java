import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        int n = scan.nextInt();
        BigInteger m = BigInteger.valueOf(1);

         for (int i=1;i<=n;i++){
             m = m.multiply(BigInteger.valueOf(i));
         }

        String s = String.valueOf(m);

        int cnt = 0;
        for (int i=s.length()-1;i>=0;i--) {
            if(s.charAt(i) == '0') cnt++;
            else break;
        }

        System.out.println(cnt);


    }


}