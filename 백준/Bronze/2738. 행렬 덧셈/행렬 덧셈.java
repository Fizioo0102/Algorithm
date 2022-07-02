import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        Scanner scan = new Scanner(System.in);

       int n = scan.nextInt();
       int m = scan.nextInt();
       int[][] a = new int[n][m];
       int[][] b = new int[n][m];

       for (int i=0;i<n;i++)
           for (int j=0;j<m;j++)
               a[i][j] = scan.nextInt();

       for (int i=0;i<n;i++)
           for (int j=0;j<m;j++)
               b[i][j] = scan.nextInt();

       for (int i=0;i<n;i++) {
           for (int j=0;j<m;j++) {
               System.out.print((a[i][j]+b[i][j]) + " " );
           }
           System.out.println();
       }


    }
}