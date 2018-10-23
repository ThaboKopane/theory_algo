public class outOf{

    public static void main(String[] args){
        String gee = "geeks4skeegs";
        char geek[] = gee.toCharArray();
        int arr[] = {0,7,8,4,4,4,1,6,6,6,4};

        for(int i=0; i<arr.length-1; i++){
            if(arr[i]> arr[i+1])
                System.out.println("the index is "+i+" "+arr[i]);
        }
    }
}