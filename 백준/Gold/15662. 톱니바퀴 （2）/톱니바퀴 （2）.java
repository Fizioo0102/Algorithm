import java.util.*;
import java.io.*;

public class Main {
    static int[][] saw;
    static int n;

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        Scanner scan = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

         n = Integer.parseInt(br.readLine());
        saw = new int[n][8];

        for (int i=0;i<n;i++) {
            String s = br.readLine();
            for (int j=0;j<8;j++) {
                saw[i][j] = s.charAt(j)-'0';
            }
        }

        int k = Integer.parseInt(br.readLine());

        while (k-->0) {
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken())-1;
            int dir = Integer.parseInt(st.nextToken());

           oper(num,dir);

            }

        int ans = 0;
        for (int i=0;i<n;i++)
           if(saw[i][0] == 1) ans++;

        System.out.println(ans);
        }

    static void rot(int x, int y) {
        if(y == -1) {
            int t = saw[x][0];
            for (int i=0;i<7;i++)
                saw[x][i] = saw[x][i+1];
            saw[x][7] = t;
        }
        else {
            int t = saw[x][7];
            for (int i=7;i>0;i--){
                saw[x][i] = saw[x][i-1];
            }
            saw[x][0] =t;
        }
    }

    static void oper(int x, int y) {
        left(x-1,-y);
        right(x+1,-y);
        rot(x,y);
    }

    static void left(int x, int y) {
        if(x<0) return;
        if(saw[x][2] == saw[x+1][6]) return;
        left(x-1,-y);
        rot(x,y);
    }

    static void right(int x, int y) {
        if(x>n-1) return;
        if(saw[x][6] == saw[x-1][2]) return;
        right(x+1,-y);
        rot(x,y);
    }
}