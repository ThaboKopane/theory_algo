
public class gridWay{

    public static int GetWays(int x, int y){
        if(x == 1 || y== 1)
            return 1;
        else
            return GetWays(-1, y) + GetWays(x, y-1);
    }
}