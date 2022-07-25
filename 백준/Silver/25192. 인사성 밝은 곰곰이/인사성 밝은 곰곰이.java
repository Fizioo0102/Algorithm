import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        Scanner scan = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int tc = Integer.parseInt(br.readLine());

        HashSet<String> hs = new HashSet<>();
        int ans =0;
        while (tc-->0) {
            String s = br.readLine();
            if(s.equals("ENTER")) {
                ans+=hs.size();
                hs.clear();
            }
            else {
                hs.add(s);
            }
        }

        ans+=hs.size();
        System.out.println(ans);

    }
}