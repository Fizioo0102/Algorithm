import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        while (true){
            String s= br.readLine();
            if(s.equals("END")){
                System.out.println(sb);
                break;
            }

            for (int i=s.length()-1;i>=0;i--){
                sb.append(s.charAt(i));
            }
            sb.append('\n');
        }

    }
}
