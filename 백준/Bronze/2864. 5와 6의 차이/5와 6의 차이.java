import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        Scanner scan = new Scanner(System.in);

        String a = scan.next();
        String b = scan.next();

        String five_one = "", five_two = "" , six_one = "", six_two = "";

        for (int i=0;i<a.length();i++) {
            if(a.charAt(i) == '6') {
                five_one += "5";
            }
            else five_one += String.valueOf(a.charAt(i));
        }

        for (int i=0;i<a.length();i++) {
            if(a.charAt(i) == '5') {
               six_one += "6";
            }
            else six_one += String.valueOf(a.charAt(i));
        }

        for (int i=0;i<b.length();i++) {
            if(b.charAt(i) == '6') {
                five_two += "5";
            }
            else five_two += String.valueOf(b.charAt(i));
        }

        for (int i=0;i<b.length();i++) {
            if(b.charAt(i) == '5') {
                six_two += "6";
            }
            else six_two += String.valueOf(b.charAt(i));
        }

        int fo = Integer.parseInt(five_one);
        int fw = Integer.parseInt(five_two);
        int so = Integer.parseInt(six_one);
        int st = Integer.parseInt(six_two);

        System.out.print((fo+fw) + " " + (so + st) );



    }


}