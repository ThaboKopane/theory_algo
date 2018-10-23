import java.util.Arrays;

public class occur{

    public static int occurence(String word, char item){
        char words[] = word.toCharArray();
        int countess =0;
        for(int i=0; i<words.length; i++){
            if(words[i] == item)
                countess++;
        }

        return countess;

    }

    public static void main(String[] args){
        String gee = "geeks4geeks";

        System.out.println(occurence(gee, 'e'));
    }
}