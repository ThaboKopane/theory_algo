import java.util.Arrays;

public class removeCH{
    static String removItem(String file, char item ){
        char items[] = file.toCharArray();
        char[] nuArr = new char[items.length];

        for(int i=0; i<items.length; i++){
            if(items[i] == item)
                continue;
            else
                nuArr[i] = items[i];
        }

        return new String(nuArr);
    }
    public static void main(String[] args){

        String gee = "Geeks4skeeG";

        System.out.println(removItem(gee, '4'));
    }
}