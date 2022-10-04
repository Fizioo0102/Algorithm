import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        boolean[] sosu = new boolean[4000001];

        sosu[0] = sosu [1] = true;

        for (int i=2;i*i<=4000000;i++) {
            if(!sosu[i]) {
                for (int j=i*i;j<=4000000; j+=i){
                    sosu[j] = true;
                }
            }
        }

        for (int i=2;i<=n;i++){
            if(!sosu[i]){
               arr.add(i);
            }
        }


        int t = arr.size();

        int[] a = new int[t];
        for (int i=0;i<t;i++){
            a[i] = arr.get(i);
        }

        int l=0, r = 0 , cnt =0 , sum=0;

        while (true) {

            if(sum >=n) {
                sum -= a[l++];
            }
            else if ( r == t) break;

            else {
                sum += a[r++];
            }

            if(n == sum) cnt++;
        }

        System.out.println(cnt);

    }
}