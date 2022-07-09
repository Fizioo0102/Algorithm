import java.util.*;
import java.io.*;

public class Main {

    static int n,m,s,e,temp;
    static int[][] dir = {{1,0},{0,1},{-1,0},{0,-1}};
    static int[][] orig,vacc;
    static boolean[][] visit;

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        m = scan.nextInt();
        orig = new int[n][m];
        vacc = new int[n][m];

        for (int i=0;i<n;i++)
            for (int j=0;j<m;j++)
                orig[i][j] = scan.nextInt();


        for (int i=0;i<n;i++) {
            for (int j=0;j<m;j++) {
                vacc[i][j] = scan.nextInt();
            }
        }
        visit = new boolean[n][m];
        diff();

        if(check()) System.out.println("YES");
        else System.out.println("NO");
    }

    static void diff() {
        for (int i=0;i<n;i++) {
            for (int j=0;j<m;j++) {
                if(orig[i][j] != vacc[i][j]){
                    bfs(i,j,vacc[i][j]);
                    return;
                }
            }
        }
    }
    static void bfs(int x, int y,int t){
        Queue<Integer> q = new LinkedList<>();
        q.add(x);
        q.add(y);
        visit[x][y] = true;

        int bef = orig[x][y];
        orig[x][y] = t;

        while (!q.isEmpty()) {
            x =q.poll();
            y = q.poll();

            for (int i=0;i<4;i++) {
                int nx = x + dir[i][0];
                int ny = y + dir[i][1];

                if(nx<0 || ny<0 || nx>=n || ny>=m) continue;
                if(visit[nx][ny]) continue;
                if(orig[nx][ny]== bef) {
                    q.add(nx);
                    q.add(ny);
                    visit[nx][ny] = true;
                    orig[nx][ny] = t;
                }

            }
        }

    }

    static boolean check() {
        for (int i=0;i<n;i++) {
            for (int j=0;j<m;j++) {
                if(orig[i][j] != vacc[i][j])
                    return false;
            }
        }

        return true;
    }

}