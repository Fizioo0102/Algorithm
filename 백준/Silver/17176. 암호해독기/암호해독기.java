import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        Scanner scan = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

     String[] cy = {" ","A","B","C","D","E","F","G","H","I","J",
     "K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y",
     "Z","a","b","c","d","e","f","g","h","i","j","k","l","m","n",
     "o","p","q","r","s","t","u","v","w","x","y","z"};

     int n =Integer.parseInt(br.readLine());

     String[] a = new String[n];

        st = new StringTokenizer(br.readLine());
     for (int i=0;i<n;i++) {

         int x = Integer.parseInt(st.nextToken());
         a[i] = cy[x];
     }

     String s = br.readLine();
     String[] b = new String[s.length()];
     for (int i=0;i<s.length();i++){
        String y = String.valueOf(s.charAt(i));
        b[i] = y;
     }

     Arrays.sort(a);
     Arrays.sort(b);

     boolean ans = true;

    for (int i=0;i<n;i++) {
        if(a[i].equals(b[i]))continue;
        else{
            ans = false;
            break;
        }

    }

    if(ans) System.out.println("y");
    else System.out.println("n");



    }
}