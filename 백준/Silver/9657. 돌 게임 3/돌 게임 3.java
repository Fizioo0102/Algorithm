import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int n = Integer.parseInt(br.readLine());

        String[] dy = new String[1001];

        for (int i=1;i<=1000;i++) {
            if(i%7 ==0 || i%7 == 2) {
                dy[i] = "CY";
            }
            else dy[i] = "SK";

        }

        System.out.println(dy[n]);


    }

}