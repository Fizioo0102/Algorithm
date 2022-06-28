import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        Integer[] milk = new Integer[n];
        int other = n%3;

        for (int i=0;i<n;i++)
            milk[i] = scan.nextInt();

        Arrays.sort(milk,Collections.reverseOrder());
        int sum = 0;


        for (int i=0;i<n;i++) {
            if (i % 3 == 2) continue;
            else sum += milk[i];
        }




        System.out.println(sum);
    }
}