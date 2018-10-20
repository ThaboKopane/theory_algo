import java.util.Arrays;
import java.util.Scanner;
public class anagram{
    public int equality(String a, String b){
        char[] aa  = a.toCharArray();
        Arrays.sort(aa);
        char[] bb = b.toCharArray();
        Arrays.sort(bb);

        int i=0, j=0;
        int count =0;

        while(i< aa.length && j<bb.length){
            if(aa[i] == bb[j]){
                count++;
                i++;
                j++;
            }
            else if(aa[i]<bb[j])
                i++;
            else if(bb[j]<aa[i])
                j++;
            

        }

        return Math.abs(aa.length - count)+ Math.abs(bb.length - count);
    }
    public static void main(String[] args){
        anagram anna = new anagram();
        Scanner scan = new Scanner(System.in);

        String fist = scan.nextLine();
        String last = scan.nextLine();

        System.out.println(anna.equality(fist, last));
        
    }
}