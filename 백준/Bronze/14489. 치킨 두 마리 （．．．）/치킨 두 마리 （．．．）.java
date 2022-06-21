import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        Scanner scan = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int chicken = c*2;

        if(a+b >= chicken) {
            System.out.println(a+b-chicken);
        }
        else
            System.out.println(a+b);

    }
}