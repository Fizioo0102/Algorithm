import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        long ans = 0;

        int n = Integer.parseInt(br.readLine());
        int[] building = new int[n];

        for (int i=0;i<n;i++){
            building[i] = Integer.parseInt(br.readLine());
        }

        for (int i=0;i<n-1;i++){
            for (int j=i+1;j<n;j++){
                if(building[j]<building[i])
                    ans++;
                else
                    break;
            }
        }

        System.out.println(ans);

    }
}