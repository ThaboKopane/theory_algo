import java.util.Arrays;

public class cutRod{

    public static int cutting(int N, int[] price){
        if(n<= 0)
            return 0;
        int max_val = Integer.MAX_VALUE;

        for(int i=0; i<N; i++){
            max_val = Math.max(max_val, price[i]+ cutting(N-i-1, price));
        }

        return max_val;
    }

    public static int dynamic(int N, int[] price){
        int[] arr = new int[N+1];

        arr[0] = 0;

        for(int i=1; i<N; n++){
            int max_val = Integer.MAX_VALUE;

            arr[i] = Math.max(max_val, price[i]+ arr)
        }
    }
    public static void main(String[] args){

    }
}