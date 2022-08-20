import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        while(true) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            int age = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());

            if(s.equals("#") && age == 0 && w == 0){
                break;
            }

            if(age>17 || w>=80){
                System.out.println(s + " Senior");
            }
            else {
                System.out.println(s + " Junior");
            }
        }


    }
}
