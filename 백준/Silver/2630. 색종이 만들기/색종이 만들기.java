import java.util.*;
import java.io.*;

public class Main {

    static int n,w,b;
    static int[][] map;

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        n = Integer.parseInt(br.readLine());
        map = new int[n][n];

        for (int i=0;i<n;i++){
            st=  new StringTokenizer(br.readLine());

            for (int j=0;j<n;j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        parti(0,0,n);
        System.out.println(w);
        System.out.println(b);

    }

    static void parti(int x, int y, int s) {

        if(color(x,y,s)){
            if(map[x][y] == 0) w++;
            else b++;
            return;
        }

        int news = s/2;

        parti(x,y,news);
        parti(x,y+news,news);
        parti(x+news,y,news);
        parti(x+news,y+news,news);

    }

    static boolean color(int x, int y, int s) {
        int c = map[x][y];

        for (int i=x;i<x+s;i++){
            for (int j=y;j<y+s;j++){
                if(c != map[i][j])
                    return false;
            }
        }

        return true;
    }
}