import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int n = Integer.parseInt(br.readLine());
        char[] a = br.readLine().toCharArray();

        Stack<Character> s = new Stack<>();
        Stack<Character> l = new Stack<>();
        int cnt = 0;

        for (int i=0;i<n;i++) {
            if(a[i]-'0'>=1 && a[i]-'0'<=9) cnt++;
            if(a[i] == 'S'){
                s.push(a[i]);
            }
            if(a[i] == 'L'){
                l.push(a[i]);
            }
            if(a[i] == 'R') {
                if(l.isEmpty()) break;
                char x = l.pop();
                if(x == 'L'){
                    cnt++;
                }
            }
            if(a[i] == 'K') {
                if(s.isEmpty()) break;
                char x = s.pop();
                if(x == 'S') cnt++;
            }
        }

        System.out.println(cnt);

    }

}
