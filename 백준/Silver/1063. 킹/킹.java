import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static Point kingPos = new Point();
    static Point stonePos = new Point();
    static final int kBoardSize = 7;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        kingPos = strPosTo2DPos(st.nextToken());
        stonePos = strPosTo2DPos(st.nextToken());
        int moveCnt = Integer.parseInt(st.nextToken());

        for (int i = 0; i < moveCnt; i++) {
            processCommand(br.readLine());
        }

        printPos(kingPos);
        printPos(stonePos);
    }

    private static void printPos(Point point){
        String outputStr = "";
        outputStr += (char)(point.x + 'A');
        outputStr += (char)(point.y + '1');
        System.out.println(outputStr);
    }


    private static Point strPosTo2DPos(String strPos){
        final int xPos = strPos.charAt(0) - 'A';
        final int yPos = strPos.charAt(1) - '1';
        return new Point(xPos, yPos);
    }

    private static boolean isInSideTheBoard(Point objPos, Point posDiff){

        boolean isInside = true;

        if((objPos.x + posDiff.x) > kBoardSize){
            isInside = false;
        } else if((objPos.x + posDiff.x) < 0){
            isInside = false;
        } else if((objPos.y + posDiff.y) > kBoardSize){
            isInside = false;
        } else if((objPos.y + posDiff.y) < 0){
            isInside = false;
        }
        return isInside;
    }

    private static void processCommand(String strCommand){

        Point pointDiff = new Point();

        switch (strCommand)
        {
            case "R":
            {
                pointDiff.x = 1;
                break;
            }
            case "L":
            {
                pointDiff.x = -1;
                break;
            }
            case "B":
            {
                pointDiff.y = -1;
                break;
            }
            case "T":
            {
                pointDiff.y = 1;
                break;
            }
            case "RT":
            {
                pointDiff.x = 1;
                pointDiff.y = 1;
                break;
            }
            case "LT":
            {
                pointDiff.x = -1;
                pointDiff.y = 1;
                break;
            }
            case "RB":
            {
                pointDiff.x = 1;
                pointDiff.y = -1;
                break;
            }
            case "LB":
            {
                pointDiff.x = -1;
                pointDiff.y = -1;
                break;
            }
            default:
            {
                break;
            }
        }

        if(isInSideTheBoard(kingPos, pointDiff)){
            if((stonePos.x == (kingPos.x + pointDiff.x)) && (stonePos.y == (kingPos.y + pointDiff.y))){
                if(isInSideTheBoard(stonePos, pointDiff)){
                    kingPos.setLocation((kingPos.x + pointDiff.x), (kingPos.y + pointDiff.y));
                    stonePos.setLocation((stonePos.x + pointDiff.x), (stonePos.y + pointDiff.y));
                }
            }else {
                kingPos.setLocation((kingPos.x + pointDiff.x), (kingPos.y + pointDiff.y));
            }
        };

    }
}
