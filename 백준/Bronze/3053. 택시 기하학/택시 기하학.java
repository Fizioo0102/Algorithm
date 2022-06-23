import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        Scanner scan = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double r = scan.nextDouble();

        System.out.println(r*r*Math.PI);
        System.out.println(2*r*r);

    }
}
