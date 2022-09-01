import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int n = Integer.parseInt(br.readLine());

        int[] dy = new int[100005];

        dy [0] = 0 ; dy[1] = 1 ; dy[2] = 1;
        dy[3] = 2; dy[4] = 2 ; dy[5] = 1; dy[6] = 2; dy[7] = 1;

        for (int i=8;i<=100001;i++) {
            int a = Math.min(dy[i-1],dy[i-2])+1;
            int b = Math.min(dy[i-5],dy[i-7])+1;

            dy[i] = Math.min(a,b);

        }

        System.out.println(dy[n]);
    }
}