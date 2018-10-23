import java.util.LinkedHashSet;

public class duplicates{

    //Hash linked list removal
    static void removeDuples(String doppel){
        LinkedHashSet<Character> lhs = new LinkedHashSet<>();

        for(int i=0; i<doppel.length(); i++)
            lhs.add(doppel.charAt(i));

        StringBuffer buffy = new StringBuffer();
        for(Character ch : lhs){
            System.out.print(ch);
            //buffy.append(ch);
        }

        System.out.pritnln(buffy);
    }

    public static void main(String[] args){
        String gee = "geeksforgeeks";

        removeDuples(gee);
    }
}