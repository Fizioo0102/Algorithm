import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int l = scan.nextInt();

        int[] fruit = new int[n];
        for (int i=0;i<n;i++) {
            fruit[i] = scan.nextInt();
        }

        Arrays.sort(fruit);

        for (int i=0;i<n;i++)
            if(fruit[i] <= l) l++;


        System.out.println(l);
    }
}