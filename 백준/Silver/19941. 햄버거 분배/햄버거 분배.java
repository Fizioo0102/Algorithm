import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        Scanner scan = new Scanner(System.in);

       int n = scan.nextInt();
       int k = scan.nextInt();
       boolean[] check = new boolean[n];

       String s = scan.next();
       int cnt =0;

       for (int i=0;i<n;i++) {
           if(s.charAt(i) == 'P') {
               for (int j=i-k;j<=i+k;j++) {
                   if(j<0 || j>=n) continue;
                   if(check[j] == false && s.charAt(j) == 'H') {
                       check[j] = true;
                       cnt++;
                       break;
                   }
               }
           }
       }

        System.out.println(cnt);
    }
}