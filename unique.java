import java.util.Arrays;

public class unique{

    public static boolean isIt(String orNot){
        
        char only[] = orNot.toCharArray();
        int i=0, j=1;

        for(i=0; i<only.length; i++)
            for( j=1; j<only.length; j++)
                if(only[i] == only[j])
                    return false;
        return true;

    }
    public static void main(String[] args){

        System.out.println(isIt("jere"));

    }
}