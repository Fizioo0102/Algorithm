import java.util.*;
import java.io.*;

public class Main {

    static int n;
    static int[][] map;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        n = Integer.parseInt(br.readLine());
        map = new int[n][n];

        for (int i=0;i<n;i++){
            String s = br.readLine();
            for (int j=0;j<n;j++){
                int x = s.charAt(j)-'0';
                map[i][j] = x;
            }
        }

        parti(0,0,n);
        System.out.println(sb);

    }

    static void parti(int x, int y, int s) {

        if(check(x,y,s)) {
            if(map[x][y] == 0) sb.append(0);
            else sb.append(1);

            return;
        }
        int news = s/2;

        sb.append('(');
        parti(x,y,news);
        parti(x,y+news,news);
        parti(x+news, y, news);
        parti(x+news, y+news ,news);
        sb.append(')');
    }

    static boolean check (int x, int y, int s) {
        int c = map[x][y];

        for (int i=x;i<x+s;i++){
            for (int j=y;j<y+s;j++){
                if( c != map[i][j]) return false;
            }
        }

        return  true;
    }
}