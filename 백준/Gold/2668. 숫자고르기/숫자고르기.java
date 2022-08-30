import java.util.*;
import java.io.*;

public class Main {

    static ArrayList<Integer> arr;
    static int n;
    static int[] a;
    static boolean[] visit;
    static ArrayList<Integer> al;

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        n = Integer.parseInt(br.readLine());

       a = new int[n+1];
       visit = new boolean[n+1];
       al = new ArrayList<>();

       for (int i=1;i<=n;i++){
           a[i] = Integer.parseInt(br.readLine());
       }

       for (int i=1;i<=n;i++){
           visit[i] = true;
           dfs(i,i);
           visit[i] = false;
       }

       Collections.sort(al);
        System.out.println(al.size());
        for (int e : al) System.out.println(e);

    }

    static void dfs(int x, int y) {
        if(visit[a[x]] == false) {
            visit[a[x]] = true;
            dfs(a[x],y);
            visit[a[x]] = false;
        }

        if(a[x] == y)
            al.add(y);
    }


}
