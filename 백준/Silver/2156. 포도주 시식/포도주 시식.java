import java.util.*;
import java.io.*;

public class Main {

    static  int n;
    static int[] wine;
    static int[][] dy;

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        wine = new int[n+1];
        dy = new int[n+1][2];

        for (int i=1;i<=n;i++)
            wine[i] = scan.nextInt();

        dy[1][0] = 0;
        dy[1][1] = wine[1];

        if(n>=2) {
            dy[2][0] = wine[2];
            dy[2][1] = wine[1] + wine[2];
        }

        for (int i=3; i<=n;i++) {
            dy[i][0] = Math.max(dy[i-2][0] + wine[i] , dy[i-2][1] + wine[i]);
            dy[i][0] = Math.max(dy[i][0] , Math.max(dy[i-3][0], dy[i-3][1] + wine[i]));
            dy[i][1] = dy[i-1][0] + wine[i];
        }


        System.out.println(Math.max(Math.max(dy[n][0],dy[n][1]),Math.max(dy[n-1][0],dy[n-1][1])));
    }
}