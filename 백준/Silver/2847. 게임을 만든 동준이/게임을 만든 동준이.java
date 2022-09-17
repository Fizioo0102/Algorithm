import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int n = Integer.parseInt(br.readLine());

        int[] level = new int[n];

        for (int i=0;i<n;i++) {
            level[i] = Integer.parseInt(br.readLine());
        }

        int cnt =0 ;

        if(n>1) {
            for (int i = n - 2; i >= 0; i--) {
                if(level[i]< level[i+1]) continue;
                else if (level[i] == level[i+1]){
                    level[i] -=1;
                    cnt++;
                }
                else {
                    int tmp = level[i] - level[i+1]+1;
                    level[i] -= tmp;
                    cnt += tmp;
                }
            }
        }

        System.out.println(cnt);

    }

}