import java.util.*;

class Solution {
    
    static int[][] map , b_map;
    static int[][] dir = {{0,0},{0,1},{1,0},{1,1}};
    static boolean[][] check;
    
    public int solution(int m, int n, String[] board) {
        int answer = 0;
       
         map = new int[m][n];

        for(int i=0;i<m;i++){
            String s = board[i];
            for(int j=0;j<n;j++){
                map[i][j] = s.charAt(j)-'A';
            }
        }


        while (true) {
            check = new boolean[m][n];
            b_map = new int[m][n];

            int x = bomb(m, n);
//            System.out.println(x);
            answer += x;
            if(x == 0) break;
            drop(m, n);
            copy(m, n);

        }
        
        return answer;
    }
    
  static int bomb(int m, int n) {

        int remove = 0;

        for(int i=0;i<m-1;i++) {
            for(int j=0;j<n-1;j++) {
                int t = map[i][j];
                if(t == -1) continue;
                int cnt = 0;
//                System.out.println("i = " + i + " j = "+j);
                for(int k=0;k<4;k++) {
                    int nx = i+ dir[k][0];
                    int ny = j + dir[k][1];
//                    System.out.println("nx = " + nx + " ny = " + ny +" " + map[nx][ny]);

                    if(map[nx][ny] != t) break;

                    cnt++;
                }

                if(cnt ==4) {
                    for(int k=0;k<4;k++) {
                        int nx = i+ dir[k][0];
                        int ny = j + dir[k][1];

                        if(!check[nx][ny]){
                            remove++;
                            check[nx][ny] = true;
                        }

                    }

                }
            }
        }

        return remove;
    }

    static void drop(int m,int n) {
        for(int i=0;i<n;i++) {
            Queue<Integer> q = new LinkedList<>();
            for(int j=m-1;j>=0;j--) {
                if(check[j][i]) continue;
                else {
                    q.add(map[j][i]);
                }
            }

            int a = m-1-q.size();
            int b = q.size();
//            System.out.println("a size = " + q.size());
            for(int j=0;j<b;j++) {
//                System.out.println("j좌표 = " + (m-1-j));
                b_map[m-1-j][i] = q.poll();
            }
            if(a>=0) {
                for(int j=a;j>=0;j--){
                    b_map[j][i] = -1;
                }
            }

        }

//        for(int i=0;i<m;i++){
//            for (int j=0;j<n;j++){
//                System.out.print(b_map[i][j] + " ");
//            }
//            System.out.println();
//        }
    }

    static void copy(int m,int n) {
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++) {
                map[i][j] = b_map[i][j];
                b_map[i][j] = 0;
            }
        }
    }
}