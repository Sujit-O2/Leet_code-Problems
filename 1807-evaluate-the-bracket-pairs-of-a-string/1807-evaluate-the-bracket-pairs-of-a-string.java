
import java.util.*;

class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {

        // Convert knowledge into HashMap
        Map<String, String> map = new HashMap<>();

        for (List<String> pair : knowledge) {
            map.put(pair.get(0), pair.get(1));
        }

        StringBuffer sb = new StringBuffer(s);

        while (sb.indexOf("(") != -1) {

            int a = sb.indexOf("(");
            int b = sb.indexOf(")", a + 1);

            String key = sb.substring(a + 1, b);

            String value = map.getOrDefault(key, "?");

            sb.replace(a, b + 1, value);
        }

        return sb.toString();
    }
}
