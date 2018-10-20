import java.util.Arrays;

public class intersection{

    public void midpoint(int[] arr1, int[] arr2){
        int i=0, j=0;

        while(i<arr1.length && j<arr2.length){
            if(arr1[i] == arr2[j]){
                System.out.println(i +" in arr 1 equals "+j+" in arr 2");
                i++;
                j++;
            }
            else if(arr1[i] < arr2[j])
                i++;
            else if(arr1[j] < arr2[i])
                j++;
            else
                System.out.println("Arrays ain't equal yoh");
        }
    }
    public static void main(String[] args){
        intersection equal = new intersection();

        int x[] = {1,2,3,4,10,15};
        int y[] = {3, 6, 11, 15, 25, 30};

        equal.midpoint(x, y);
    }
}