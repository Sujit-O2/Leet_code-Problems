import java.util.*;

class Solution {
    public String sortString(String s) {
        StringBuilder bb = new StringBuilder();
        HashMap<Character, Integer> aa = new HashMap<>();

        for (char c : s.toCharArray()) {
            aa.put(c, aa.getOrDefault(c, 0) + 1);
        }

        while (!aa.isEmpty()) {

            for (char c = 'a'; c <= 'z'; c++) {
                if (aa.containsKey(c)) {
                    bb.append(c);
                    aa.put(c, aa.get(c) - 1);

                    if (aa.get(c) == 0) {
                        aa.remove(c);
                    }
                }
            }
            for (char c = 'z'; c >= 'a'; c--) {
                if (aa.containsKey(c)) {
                    bb.append(c);
                    aa.put(c, aa.get(c) - 1);

                    if (aa.get(c) == 0) {
                        aa.remove(c);
                    }
                }
            }
        }

        return bb.toString();
    }
}