import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] map = new int[n][n];
        int[][] dy = new int[n][n];

        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            for (int j=0;j<n;j++){
                map[i][j] = Integer.parseInt(st.nextToken());
                if(j==0){
                    dy[i][j] = map[i][j];
                }
                else {
                    dy[i][j] = map[i][j]+dy[i][j-1];
                }
            }
        }

//        for (int i=0;i<n;i++){
//            for (int j=0;j<n;j++){
//                System.out.print(dy[i][j] +" ");
//            }
//            System.out.println();
//        }

        while (m-->0) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            int sum =0;
            for (int i=x1-1;i<=x2-1;i++){
                sum += dy[i][y2-1];
//                System.out.print("sum+ = " + sum);
                if(y1 ==1 ) continue;
                sum -= dy[i][y1-2];
//                System.out.println(" sum - = "+sum);
            }

           sb.append(sum).append('\n');
        }
        System.out.println(sb);
    }
}