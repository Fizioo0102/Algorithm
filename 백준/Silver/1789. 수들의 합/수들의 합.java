import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        Scanner scan = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;


        Long n = Long.parseLong(br.readLine());

        Long ans = 0L;

        for (Long i=1L;i<n;i++) {
            ans +=i;
             if(ans == n) {
                ans = i;
                break;
            }
            if(ans > n){
                ans = i-1;
                break;
            }
        }

       if(n==1) System.out.println(1);
        else
        System.out.println(ans);
    }
}