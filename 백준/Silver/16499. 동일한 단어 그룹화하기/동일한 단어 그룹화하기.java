import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        String [] word = new String[n];

        HashSet<String> hs = new HashSet<>();
        for (int i=0;i<n;i++) {
            word[i] = scan.next();
            String s ="";
            String[] temp = new String[word[i].length()];
            for(int j=0;j<word[i].length();j++) {
                temp[j] = String.valueOf(word[i].charAt(j));
            }
            Arrays.sort(temp);
            for(int j=0;j<word[i].length();j++)
                s+=temp[j];

            hs.add(s);
        }

        System.out.println(hs.size());
    }
}