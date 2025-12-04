import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class sortBy_word {

    public static void main(String[] args) {
        String s = "I love IBM";
String[] words = s.split(" ");
 Collections.reverse(Arrays.asList(words));
 List<String>ll=Arrays.asList(words);
 System.out.println(ll);
    }
}