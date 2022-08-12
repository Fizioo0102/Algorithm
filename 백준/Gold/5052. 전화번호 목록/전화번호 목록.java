import java.util.*;
import java.io.*;

public class Main {

    static int cnt;
    static boolean[][] visit;
    static int[][] dir = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int tc = Integer.parseInt(br.readLine());
        while (tc-->0) {

            boolean check = true;
            int n = Integer.parseInt(br.readLine());
            String[] pn = new String[n];

            for (int i=0;i<n;i++){
                pn[i] = br.readLine();
            }

            Arrays.sort(pn);

            for (int i=0;i<n-1;i++){
                if(pn[i+1].startsWith(pn[i])){
                    check = false;
                    break;
                }
            }

            if(check) System.out.println("YES");
            else System.out.println("NO");

        }
    }
}