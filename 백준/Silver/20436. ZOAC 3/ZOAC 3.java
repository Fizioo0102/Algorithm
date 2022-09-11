import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int[][] hand = {{1,0},{2,4},{2,2},{1,2},{0,2},{1,3},{1,4},
                {1,5},{0,7},{1,6},{1,7},{1,8},{2,6},{2,5},{0,8},{0,9},
                {0,0},{0,3},{1,1},{0,4},{0,6},{2,3},{0,1}
                ,{2,1},{0,5},{2,0}};

        st = new StringTokenizer(br.readLine());
        String l = st.nextToken();
        int ln = l.charAt(0)-'a';

        String r = st.nextToken();
        int rn = r.charAt(0)-'a';
       

        String s = br.readLine();

        int cnt = 0;
        for (int i=0;i<s.length();i++) {
            int ss = s.charAt(i)-'a';

            if(ss== 24 ||ss== 20 ||ss== 8 ||ss== 14 ||ss== 15
                    ||ss== 7 ||ss== 9 ||ss== 10 ||ss== 11
                    ||ss== 1 ||ss== 13 ||ss== 12){
                cnt += (Math.abs(hand[rn][0]-hand[ss][0])+Math.abs(hand[rn][1]-hand[ss][1]));
                rn = ss;
            }
            else {
                cnt += (Math.abs(hand[ln][0]-hand[ss][0])+Math.abs(hand[ln][1]-hand[ss][1]));
                ln = ss;
            }
        }

        System.out.println(cnt+s.length());
    }

}