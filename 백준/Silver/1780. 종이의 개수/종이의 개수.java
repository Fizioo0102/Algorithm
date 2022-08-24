import java.util.*;
import java.io.*;

public class Main {

    static int n,zero,one,minus;
    static int[][] map;

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        n =Integer.parseInt(br.readLine());
        map = new int[n][n];

        for (int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            for (int j=0;j<n;j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        parti(0,0,n);
        System.out.println(minus);
        System.out.println(zero);
        System.out.println(one);

    }

    static void parti(int x, int y, int s) {

        if(check(x,y,s)){
            if(map[x][y] == 0){
                zero++;
            }
            else if(map[x][y] == 1) {
                one++;
            }
           else if(map[x][y] == -1){
                minus++;
            }

            return;
        }
        int news = s/3;

        parti(x,y+news,news);
        parti(x,y+news+news,news);
        parti(x+news,y,news);
        parti(x+news+news,y,news);
        parti(x+news,y+news,news);
        parti(x+news,y+news+news,news);
        parti(x+news+news,y+news,news);
        parti(x+news+news,y+news+news,news);
        parti(x,y,news);
    }

    static boolean check(int x, int y, int s ){
        int c = map[x][y];

        for (int i=x;i<x+s;i++){
            for (int j=y;j<y+s;j++){
                if(c != map[i][j]) return false;
            }
        }

        return true;
    }
}