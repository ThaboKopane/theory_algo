import java.util.Arrays;

public class stringSwap{

    static String swap(String a, int i, int j){

        char charArray[] = a.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;

        return String.valueOf(charArray);
    }

    private void permute(String str, int l, int n){
        if(l==n)
            System.out.println(str);
        else{
            for(int i=1; i<=n; i++){
                str = swap(str, l, i);
                permute(str, l+1, n);
                str = swap(str, l, i);
            }
        }
    }

    public static void main(String[] args){

        stringSwap stringPerm = new stringSwap();
        String gee = "michael";

        System.out.println(swap(gee, 1, 5));
        stringPerm.permute(gee, 0, gee.length()-1);
    }
}