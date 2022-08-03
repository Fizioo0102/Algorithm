import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        boolean ans = false;

        for (int i=0;i<=s.length()-5;i++){
            int cnt =1;

            for (int j=i;j<i+4;j++){
                int x = s.charAt(j)-'A';
                if(Math.abs((s.charAt(j+1)-'A')-x) == 1) cnt++;
                else break;
            }
            if(cnt ==5){
                ans = true;
                break;
            }
        }

        if(ans) System.out.println("YES");
        else System.out.println("NO");
    }
}
