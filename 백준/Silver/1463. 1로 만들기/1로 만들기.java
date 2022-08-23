import java.util.*;
import java.io.*;

public class Main {

    static Integer[] dy;
    static int n;

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        n = scan.nextInt();
        dy= new Integer[n+1];

        dy[0] = dy[1] =0;

        System.out.println(one(n));
    }

    static int one (int n){
        if(dy[n] == null) {
            if(n%6 == 0){
                dy[n] = Math.min(one(n-1),Math.min(one(n/3),one(n/2)))+1;
            }

            else if(n%3 ==0) {
                dy[n] = Math.min(one(n/3),one(n-1))+1;
            }

            else if(n%2 ==0 ) {
                dy[n] = Math.min(one(n/2),one(n-1))+1;
            }

            else {
                dy[n] = one(n-1)+1;
            }
        }

        return dy[n];
    }

}
