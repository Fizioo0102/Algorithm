import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        boolean check =false;
        int g = Integer.parseInt(br.readLine());

        int l=1, r=2;

        while (r<=100000) {
            long kg = (r*r) - (l*l);

            if(kg == g){
                sb.append(r).append('\n');
                check = true;
                l++;
            }
            if(kg<g){
                r++;
            }
            if(kg>g){
                l++;
            }
        }

        if(check == false) System.out.println(-1);
        else System.out.println(sb);

    }
}
