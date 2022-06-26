import java.util.*;
import java.io.*;

public class Main {


    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        Scanner scan = new Scanner(System.in);

       int n = scan.nextInt();
       int[] a = {0,3,1,4,2};
       int[] b = {1,0,1,0,1};


       if(n>=5) {
           int ans = a[n % 5] + (((n-5)/5)+b[n%5]);
           System.out.println(ans);
       }
       else {
           if(n==1)
               System.out.println(-1);
           if(n==2)
               System.out.println(1);
           if(n==3)
               System.out.println(-1);
           if(n==4)
               System.out.println(2);

       }
    }
}