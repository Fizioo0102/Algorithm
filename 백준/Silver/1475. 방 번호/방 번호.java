import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int[] num = new int[10];

        String s = br.readLine();

        for (int i=0;i<s.length();i++){
            int x = s.charAt(i)-'0';
            if(x == 6 || x == 9) {
                if(num[6] < num[9]){
                    num[6]++;
                }
                else {
                    num[9]++;
                }
            }
            else {
                num[x]++;
            }
        }

        int max = 0;
        for (int i=0;i<10;i++){
           max = Math.max(max,num[i]);
        }

        System.out.println(max);
    }
}
