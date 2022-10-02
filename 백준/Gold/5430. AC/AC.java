import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int tc = Integer.parseInt(br.readLine());
        while (tc-->0) {


            Deque<Integer> d = new LinkedList<>();

            String s = br.readLine();
            int n = Integer.parseInt(br.readLine());
            String a = br.readLine();
            a = a.substring(1, a.length() - 1);

            int[] arr = new int[n];

            if (n > 1) {
                String[] cut = a.split(",");
                for (int i = 0; i < n; i++) {

                    d.add(Integer.parseInt(cut[i]));

                }
            } else if (n == 1) {
                d.add(Integer.parseInt(a));
            }


            boolean e = false;
            boolean direction = false;  //false 가 앞쪽 true가 뒷쪽
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);

                if (c == 'R') {
                    if (direction == false) {
                        direction = true;
                    } else {
                        direction = false;
                    }
                }

                if (c == 'D') {
                    if (d.isEmpty()) {
                        e = true;
                        sb.append("error").append('\n');
                        break;
                    }
                    if (!d.isEmpty()) {
                        if (direction) {
                            d.pollLast();
                        }
                        if (direction == false) {
                            d.pollFirst();
                        }
                    }
                }
            }


            if (e == false) {
                sb.append("[");
                int t = d.size();
                if (direction == false) {
                    for (int i = 0; i < t; i++) {
                        if (i < t - 1) {
                            sb.append(d.pollFirst()).append(',');
                        }
                        if (i == t - 1) {
                            sb.append(d.pollFirst());
                        }

                    }
                }
                if (direction) {
                    for (int i = t - 1; i >= 0; i--) {
                        if (i > 0) {
                            sb.append(d.pollLast()).append(',');
                        }
                        if (i == 0) {
                            sb.append(d.pollLast());
                        }

                    }
                }

                sb.append("]").append('\n');
            }



        }

        System.out.println(sb);
    }
}