import java.util.Arrays;

public class longest{


    //I missed the for loop, but i'll be fine i think
    public static int lps(String paliWithin){
        char paliWithinArr[] = paliWithin.toCharArray();

        if(paliWithinArr.length == 1)
            return 1;
        if(paliWithinArr.length == 2 && paliWithinArr[0]==paliWithinArr[1])
            return 2;
        if(paliWithinArr[0] == paliWithinArr[paliWithinArr.length-1])
            return lps(String.valueOf(Arrays.copyOfRange(paliWithinArr, 1, paliWithinArr.length-2)))+2;
        return Math.max(lps(String.valueOf(Arrays.copyOfRange(paliWithinArr, 0, paliWithinArr.length-2))),
        lps(String.valueOf(Arrays.copyOfRange(paliWithinArr, 1, paliWithinArr.length-1))));

    }

    public static void main(String[] args){
        System.out.println(lps("Geeks4Geeks"));

        
    }
}