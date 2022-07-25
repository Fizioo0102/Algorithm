import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        Scanner scan = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

       TreeMap<String,Integer> tm = new TreeMap<>();
        int treecount = 0;

        while (true) {
            String tree = br.readLine();

            if(tree==null || tree.equals("")||treecount>1000000) break;

            treecount++;

           tm.put(tree,tm.getOrDefault(tree,0)+1);
        }

        for (String s : tm.keySet()) {
            Double x = Double.valueOf(tm.get(s));
            double percent = x/treecount*100;
            System.out.println(s +" "+ String.format("%.4f",percent) );
        }

    }
}