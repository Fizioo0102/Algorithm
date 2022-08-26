import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int T = scan.nextInt();


        for (int s = 0; s < T; s++) {

            boolean check = false;
            int m = scan.nextInt();
            int n = scan.nextInt();
            int x = scan.nextInt() - 1;
            int y = scan.nextInt() - 1;

            for (int i = x; i < (n * m); i += m) {
                if (i % n == y) {
                    System.out.println(i + 1);
                    check = true;
                    break;
                }
            }

            if (!check) {
                System.out.println(-1);

            }
        }
    }
}