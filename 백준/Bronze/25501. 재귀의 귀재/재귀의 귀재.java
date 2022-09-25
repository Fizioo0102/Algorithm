import java.util.*;
import java.io.*;

public class Main {

    static int cnt;
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int n  = Integer.parseInt(br.readLine());

        while (n-->0) {
            cnt = 0;
            String s = br.readLine();

            System.out.print(palin(s)+" ");
            System.out.println(cnt);
        }
    }

    static int rec(String s, int l, int r) {
        cnt++;
        if(l>=r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return rec(s,l+1,r-1);
    }

    static int palin(String s) {
        return rec(s,0,s.length()-1);
    }
}