import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] dy = new int[n];

        dy[0] = arr[0];

        for (int i=1;i<n;i++) {
            dy[i] = arr[i];

            for (int j=0;j<i;j++){
                if(arr[i]>arr[j]){
                    dy[i]= Math.max(dy[j]+arr[i],dy[i]);

                }
            }
        }

        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++) {
           max = Math.max(max,dy[i]);
        }
        System.out.println(max);

    }
}