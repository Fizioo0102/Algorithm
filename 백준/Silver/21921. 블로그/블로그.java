import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        int sum = 0 , cnt =1;

        st = new StringTokenizer(br.readLine());
        for (int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
            if(i<x){
                sum+=arr[i];
            }
        }
        int max = sum;

//        System.out.println(max);
      for (int l=1 ;l<=n-x;l++) {
          int r = l+x;
          sum -=arr[l-1];
          sum +=arr[r-1];

//          System.out.println("i = "+ l + " sum = " + sum + " r = " + r);

         if(max<sum) {
             max = sum;
             cnt = 1;
         }

        else  if(max == sum) {
             cnt++;
         }

//          System.out.println("cnt = " +cnt);
      }

      if(max ==  0) {
          System.out.println("SAD");
      }
      else {
          System.out.println(max);
          System.out.println(cnt);
      }
    }

}
