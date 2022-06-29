import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        Scanner scan = new Scanner(System.in);

        String s = scan.next();

        String[] arr = new String[s.length()];
        char[] word = new char[s.length()];

        for (int i=0;i<s.length();i++)
            word[i] = s.charAt(i);

        for (int i=0;i<s.length();i++) {
            String x = "";
            for (int j=i;j<s.length();j++) {
                x += String.valueOf(word[j]);
            }
            arr[i] = x;
        }

        Arrays.sort(arr);

        for (int i=0;i<arr.length;i++)
            System.out.println(arr[i]);

    }
}