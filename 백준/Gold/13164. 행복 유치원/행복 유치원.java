import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] child = new int[n];

        for (int i=0;i<n;i++){
            child[i] = scan.nextInt();
        }
        int[] diff = new int[n-1];


        for (int i=0;i<n-1;i++){
            diff[i] = child[i+1]-child[i];
        }

        Arrays.sort(diff);

        int ans = 0;

        for (int i=0;i<n-m;i++)
            ans +=diff[i];

        System.out.println(ans);


    }

}