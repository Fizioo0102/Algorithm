import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        Scanner scan = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        char[] s = br.readLine().toCharArray();

        int ans =0, cnt =0;

        for (int i=1;i<m-1;i++) {
            if(s[i - 1] == 'I' && s[i] == 'O' && s[i + 1] == 'I') {
                cnt++;

                if(cnt == n) {
                    cnt--;
                    ans++;
                }
                i++;
            }
            else {
                cnt = 0;
            }
        }
        System.out.println(ans);
    }
}