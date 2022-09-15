import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int[][] a = new int[h][w];
        int[][] b = new int[h+x][w+y];

        for (int i=0;i<h+x;i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0;j<w+y;j++) {
                b[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i=0;i<h+x;i++) {
            for (int j=0;j<w+y;j++) {
               if(i<x && j<w) {
                   a[i][j] = b[i][j];
               }
               else if(j<y && i<h) {
                   a[i][j] = b[i][j];
}
               else if(j>=y && i>=x && j<w && i<h) {
                   a[i][j] = (b[i][j] -a[i-x][j-y]);
               }
            }
        }

        for (int i=0;i<h;i++){
            for (int j=0;j<w;j++) {
                sb.append(a[i][j]).append(' ');
            }
            sb.append('\n');
        }

        System.out.println(sb);
    }

}