import java.util.Arrays;

public class rotation{

    public int[] rotary(int[] arr, int d){
        int[] temp = new int[d];

        for(int i=0; i<d; i++){
            temp[i] = arr[i];
        }
        for(int j=d; j<arr.length; j++){
            arr[j-d] = arr[j];
        }
        for(int m=0; m<d; m++){
            arr[m+arr.length-d] = temp[m];
        }

        return arr;
    }
    public static void main(String[] args){
        rotation shift = new rotation();

        int x[] = {1,2,3,4,5};

        System.out.println(Arrays.toString(shift.rotary(x, 4)));
    }
}