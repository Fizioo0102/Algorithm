import java.util.*;
import java.io.*;

public class Main {

    static int[][] dir = {{-1,0},{0,-1},{1,0},{0,1}};
    static int[][] sea,map;
    static int n,m,sx=Integer.MAX_VALUE,ex=Integer.MIN_VALUE,sy=Integer.MAX_VALUE,ey=Integer.MIN_VALUE;
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        Scanner scan = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;


         n = scan.nextInt();
         m = scan.nextInt();
         map = new int[n+2][m+2];
         sea = new int[n+2][m+2];

        for (int i=1;i<=n;i++) {
            String s = scan.next();
            for (int j=1;j<=m;j++) {
               char a = s.charAt(j-1);
                if(a == '.')
                    map[i][j] = -1;
                else
                    map[i][j]=2;
            }
        }

       for (int j=0;j<m+2;j++) {
           int i=0; int k=n+1;
           map[i][j] = -1;
           map[k][j] = -1;
       }

       for (int i=0;i<n+2;i++) {
           int j=0; int k=m+1;
           map[i][j] = -1;
           map[i][k] = -1;
       }

       year();


       for (int i=0;i<n+2;i++){
           for (int j=0;j<m+2;j++){
              if(sea[i][j] == 2 ){
                  sx = Math.min(sx,j);
                  ex = Math.max(ex,j);
              }
           }
       }

        for (int j=0;j<m+2;j++){
            for (int i=0;i<n+2;i++){
                if(sea[i][j] == 2){
                    sy = Math.min(sy,i);
                    ey = Math.max(ey,i);
                }

            }
        }

        for (int i=sy;i<=ey;i++){
            for (int j=sx;j<=ex;j++){
                if(sea[i][j] == -1)
                    sb.append('.');
                if(sea[i][j] == 2)
                    sb.append('X');
            }
            sb.append('\n');
        }

        System.out.println(sb);


    }

    static int[][] year(){
        for (int i=0;i<n+2;i++) {
            for (int j=0;j<m+2;j++){
                if(map[i][j] == -1){
                    sea[i][j] = -1;
                }
                else{
                    int cnt =0;
                    for (int k=0;k<4;k++){
                        int nx = i+dir[k][0];
                        int ny = j+dir[k][1];

                        if(nx<0||ny<0||nx>=n+2||ny>=m+2)continue;
                        if(map[nx][ny] == -1) cnt++;
                    }
                    int t = map[i][j] - cnt;
                    if(t<0) sea[i][j] = -1;
                    else sea[i][j] = 2;
                }
            }
        }
        return sea;
    }
}