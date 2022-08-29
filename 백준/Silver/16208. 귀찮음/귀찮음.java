import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int n = Integer.parseInt(br.readLine());
        int[] iron = new int[n];
        int sum =0;

        st = new StringTokenizer(br.readLine());
        for (int i=0;i<n;i++) {
            iron[i] = Integer.parseInt(st.nextToken());
            sum+=iron[i];
        }

        Arrays.sort(iron);
        long money = 0;
        for (int i=0;i<n-1;i++) {
            sum -= iron[i];
            money +=(iron[i] * sum);
        }

        System.out.println(money);


    }

}
