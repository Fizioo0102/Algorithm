import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        st = new StringTokenizer(br.readLine());
        int[] team = new int[4];

        for (int i=0;i<4;i++){
            team[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(Math.abs((team[0]+team[3]) - (team[2]+team[1])));

    }
}
