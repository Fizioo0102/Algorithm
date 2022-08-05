import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int sum =0;

        int n = Integer.parseInt(br.readLine());
        int[] w = new int[n];

        st = new StringTokenizer(br.readLine());

        boolean one  =false;

        for (int i=0;i<n;i++){
            w[i] = Integer.parseInt(st.nextToken());


            if(w[i] == 1) one = true;
        }

        if(one==false) {
            System.out.println(1);
        }
        else {
            Arrays.sort(w);

            for (int i=0;i<n;i++) {
                if(w[i] <= sum+1) {
                    sum+=w[i];
                }
                else break;
            }

            System.out.println(sum+1);

        }


    }
}
