import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for (int t=0;t<n;t++){
            String s= br.readLine();

            for (int i=s.length()-1;i>=0;i--){
                sb.append(s.charAt(i));
            }
            sb.append('\n');
        }

        System.out.println(sb);

    }
}
