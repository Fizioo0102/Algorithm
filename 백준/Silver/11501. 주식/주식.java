import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int tc = Integer.parseInt(br.readLine());
        while (tc --> 0) {
            int n = Integer.parseInt(br.readLine());

            int[] arr = new int[n];

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            long cnt = 0;
            int max = arr[n - 1];
            for (int i = n - 2; i >= 0; i--) {
               if(max < arr[i]){
                        max = arr[i];
                    }
                else {
                    cnt += (max - arr[i]);


                }

//                System.out.println("i= "+i+" cnt= " + cnt +" max= "+max);
            }

            System.out.println(cnt);
        }
    }

}