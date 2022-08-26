import java.io.*;
import java.util.*;

public class Main {

    static int n,m;
    static int[][] map;

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        st = new StringTokenizer(br.readLine());
         n = Integer.parseInt(st.nextToken());
         m = Integer.parseInt(st.nextToken());
        map= new int[n][m];

        for (int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            for (int j=0;j<m;j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

       int max = Integer.MIN_VALUE;

        if(max<nemo()) max = nemo();
        if(max<nieun()) max = nieun();
        if (max<straight()) max = straight();
        if(max<giek()) max = giek();
        if(max<z()) max = z();
        if(max<o()) max = o();

        System.out.println(max);



    }

    static int nemo() {
        int max = Integer.MIN_VALUE;
        int[][] dir = {{1,0},{0,1},{1,1},{0,0}};

        for (int i=0;i<n-1;i++){
            for (int j=0;j<m-1;j++) {
                int sum =0;
                for (int k=0;k<4;k++){
                    int nx = i + dir[k][0];
                    int ny = j+ dir[k][1];

                    sum+=map[nx][ny];
                }
                max= Math.max(max,sum);
            }
        }

        return max;
    }

    static int straight() {
        int max_garo = Integer.MIN_VALUE, max_sero = Integer.MIN_VALUE;
        int[][] dir_garo = {{0,0},{0,1},{0,2},{0,3}};
        int[][] dir_sero = {{0,0},{1,0},{2,0},{3,0}};

        //가로
        for (int i=0;i<n;i++){
            for (int j=0;j<m-3;j++) {
                int sum =0;
                for (int k=0;k<4;k++){
                    int nx = i + dir_garo[k][0];
                    int ny = j+ dir_garo[k][1];

                    sum+=map[nx][ny];
                }
                max_garo= Math.max(max_garo,sum);
            }
        }

        //세로
        for (int i=0;i<n-3;i++){
            for (int j=0;j<m;j++) {
                int sum =0;
                for (int k=0;k<4;k++){
                    int nx = i + dir_sero[k][0];
                    int ny = j+ dir_sero[k][1];

                    sum+=map[nx][ny];
                }
                max_sero= Math.max(max_sero,sum);
            }
        }

        return Math.max(max_garo,max_sero);
    }

    static int nieun() {
        int max_1 = Integer.MIN_VALUE;
        int max_2 = Integer.MIN_VALUE;
        int max_3 = Integer.MIN_VALUE;
        int max_4 = Integer.MIN_VALUE;

        int[][] dir_1 = {{0,2},{1,0},{1,1},{1,2}};
        int[][] dir_2 = {{0,0},{1,0},{1,1},{1,2}};
        int[][] dir_3 = {{0,1},{1,1},{2,0},{2,1}};
        int[][] dir_4 = {{0,0},{1,0},{2,0},{2,1}};

        //가로
        for (int i=0;i<n-1;i++){
            for (int j=0;j<m-2;j++) {
                int sum =0;
                for (int k=0;k<4;k++){
                    int nx = i + dir_1[k][0];
                    int ny = j+ dir_1[k][1];

                    sum+=map[nx][ny];
                }
                max_1= Math.max(max_1,sum);
            }
        }

        for (int i=0;i<n-1;i++){
            for (int j=0;j<m-2;j++) {
                int sum =0;
                for (int k=0;k<4;k++){
                    int nx = i + dir_2[k][0];
                    int ny = j+ dir_2[k][1];

                    sum+=map[nx][ny];
                }
                max_2= Math.max(max_2,sum);
            }
        }

        //세로
        for (int i=0;i<n-2;i++){
            for (int j=0;j<m-1;j++) {
                int sum =0;
                for (int k=0;k<4;k++){
                    int nx = i + dir_3[k][0];
                    int ny = j+ dir_3[k][1];

                    sum+=map[nx][ny];
                }
                max_3= Math.max(max_3,sum);
            }
        }

        for (int i=0;i<n-2;i++){
            for (int j=0;j<m-1;j++) {
                int sum =0;
                for (int k=0;k<4;k++){
                    int nx = i + dir_4[k][0];
                    int ny = j+ dir_4[k][1];

                    sum+=map[nx][ny];
                }
                max_4= Math.max(max_4,sum);
            }
        }

        int maxgaro = Math.max(max_1,max_2);
        int maxsero = Math.max(max_3,max_4);

        return Math.max(maxsero,maxgaro);
    }

    static int giek() {
        int max_1 = Integer.MIN_VALUE;
        int max_2 = Integer.MIN_VALUE;
        int max_3 = Integer.MIN_VALUE;
        int max_4 = Integer.MIN_VALUE;

        int[][] dir_1 = {{0,0},{0,1},{0,2},{1,0}};
        int[][] dir_2 = {{0,0},{0,1},{0,2},{1,2}};
        int[][] dir_3 = {{0,0},{0,1},{1,0},{2,0}};
        int[][] dir_4 = {{0,0},{0,1},{1,1},{2,1}};

        //가로
        for (int i=0;i<n-1;i++){
            for (int j=0;j<m-2;j++) {
                int sum =0;
                for (int k=0;k<4;k++){
                    int nx = i + dir_1[k][0];
                    int ny = j+ dir_1[k][1];

                    sum+=map[nx][ny];
                }
                max_1= Math.max(max_1,sum);
            }
        }

        for (int i=0;i<n-1;i++){
            for (int j=0;j<m-2;j++) {
                int sum =0;
                for (int k=0;k<4;k++){
                    int nx = i + dir_2[k][0];
                    int ny = j+ dir_2[k][1];

                    sum+=map[nx][ny];
                }
                max_2= Math.max(max_2,sum);
            }
        }

        //세로
        for (int i=0;i<n-2;i++){
            for (int j=0;j<m-1;j++) {
                int sum =0;
                for (int k=0;k<4;k++){
                    int nx = i + dir_3[k][0];
                    int ny = j+ dir_3[k][1];

                    sum+=map[nx][ny];
                }
                max_3= Math.max(max_3,sum);
            }
        }

        for (int i=0;i<n-2;i++){
            for (int j=0;j<m-1;j++) {
                int sum =0;
                for (int k=0;k<4;k++){
                    int nx = i + dir_4[k][0];
                    int ny = j+ dir_4[k][1];

                    sum+=map[nx][ny];
                }
                max_4= Math.max(max_4,sum);
            }
        }

        int maxgaro = Math.max(max_1,max_2);
        int maxsero = Math.max(max_3,max_4);

        return Math.max(maxsero,maxgaro);
    }

    static int z() {
        int max_1 = Integer.MIN_VALUE;
        int max_2 = Integer.MIN_VALUE;
        int max_3 = Integer.MIN_VALUE;
        int max_4 = Integer.MIN_VALUE;

        int[][] dir_1 = {{1,0},{1,1},{0,1},{0,2}};
        int[][] dir_2 = {{0,0},{0,1},{1,1},{1,2}};
        int[][] dir_3 = {{0,0},{1,0},{1,1},{2,1}};
        int[][] dir_4 = {{0,1},{1,0},{1,1},{2,0}};

        //가로
        for (int i=0;i<n-1;i++){
            for (int j=0;j<m-2;j++) {
                int sum =0;
                for (int k=0;k<4;k++){
                    int nx = i + dir_1[k][0];
                    int ny = j+ dir_1[k][1];

                    sum+=map[nx][ny];
                }
                max_1= Math.max(max_1,sum);
            }
        }

        for (int i=0;i<n-1;i++){
            for (int j=0;j<m-2;j++) {
                int sum =0;
                for (int k=0;k<4;k++){
                    int nx = i + dir_2[k][0];
                    int ny = j+ dir_2[k][1];

                    sum+=map[nx][ny];
                }
                max_2= Math.max(max_2,sum);
            }
        }

        //세로
        for (int i=0;i<n-2;i++){
            for (int j=0;j<m-1;j++) {
                int sum =0;
                for (int k=0;k<4;k++){
                    int nx = i + dir_3[k][0];
                    int ny = j+ dir_3[k][1];

                    sum+=map[nx][ny];
                }
                max_3= Math.max(max_3,sum);
            }
        }

        for (int i=0;i<n-2;i++){
            for (int j=0;j<m-1;j++) {
                int sum =0;
                for (int k=0;k<4;k++){
                    int nx = i + dir_4[k][0];
                    int ny = j+ dir_4[k][1];

                    sum+=map[nx][ny];
                }
                max_4= Math.max(max_4,sum);
            }
        }

        int maxgaro = Math.max(max_1,max_2);
        int maxsero = Math.max(max_3,max_4);

        return Math.max(maxsero,maxgaro);
    }

    static int o() {
        int max_1 = Integer.MIN_VALUE;
        int max_2 = Integer.MIN_VALUE;
        int max_3 = Integer.MIN_VALUE;
        int max_4 = Integer.MIN_VALUE;

        int[][] dir_1 = {{0,1},{1,1},{1,2},{1,0}};
        int[][] dir_2 = {{0,0},{0,1},{0,2},{1,1}};
        int[][] dir_3 = {{0,0},{1,0},{2,0},{1,1}};
        int[][] dir_4 = {{1,0},{0,1},{1,1},{2,1}};

        //가로
        for (int i=0;i<n-1;i++){
            for (int j=0;j<m-2;j++) {
                int sum =0;
                for (int k=0;k<4;k++){
                    int nx = i + dir_1[k][0];
                    int ny = j+ dir_1[k][1];

                    sum+=map[nx][ny];
                }
                max_1= Math.max(max_1,sum);
            }
        }

        for (int i=0;i<n-1;i++){
            for (int j=0;j<m-2;j++) {
                int sum =0;
                for (int k=0;k<4;k++){
                    int nx = i + dir_2[k][0];
                    int ny = j+ dir_2[k][1];

                    sum+=map[nx][ny];
                }
                max_2= Math.max(max_2,sum);
            }
        }

        //세로
        for (int i=0;i<n-2;i++){
            for (int j=0;j<m-1;j++) {
                int sum =0;
                for (int k=0;k<4;k++){
                    int nx = i + dir_3[k][0];
                    int ny = j+ dir_3[k][1];

                    sum+=map[nx][ny];
                }
                max_3= Math.max(max_3,sum);
            }
        }

        for (int i=0;i<n-2;i++){
            for (int j=0;j<m-1;j++) {
                int sum =0;
                for (int k=0;k<4;k++){
                    int nx = i + dir_4[k][0];
                    int ny = j+ dir_4[k][1];

                    sum+=map[nx][ny];
                }
                max_4= Math.max(max_4,sum);
            }
        }

        int maxgaro = Math.max(max_1,max_2);
        int maxsero = Math.max(max_3,max_4);

        return Math.max(maxsero,maxgaro);
    }


}