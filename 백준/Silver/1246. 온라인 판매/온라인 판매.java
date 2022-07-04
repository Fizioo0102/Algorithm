import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] customer = new int[m];
        for (int i=0;i<m;i++)
            customer[i] = scan.nextInt();

        Arrays.sort(customer);

        int max_cost = Integer.MIN_VALUE;
        int cost = 0;

        if(n<m) {
        for (int i=m-n ;i<m;i++) {

            int a = customer[i];
            int num = m - i;

            if (a * num >= max_cost) {
                max_cost = a * num;
                cost = a;
              }
            }
        }
        else {
            for (int i=0 ;i<m;i++) {

                int a = customer[i];
                int num = m - i;

                if (a * num >= max_cost) {
                    max_cost = a * num;
                    cost = a;
                }
            }
        }

        System.out.println(cost + " " + max_cost);
    }
}