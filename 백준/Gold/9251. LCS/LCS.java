import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        char[] a = br.readLine().toCharArray();
        char[] b = br.readLine().toCharArray();

       int[][] dy = new int[a.length+1][b.length+1];

       for (int i=1;i<=a.length;i++){
           for (int j=1;j<=b.length;j++){
               if(a[i-1] == b[j-1]){
                   dy[i][j] = dy[i-1][j-1]+1;
               }
               else{
                   dy[i][j] = Math.max(dy[i-1][j],dy[i][j-1]);
               }
           }
       }

        System.out.println(dy[a.length][b.length]);



    }
}
