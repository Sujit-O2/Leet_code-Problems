import java.util.*;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.replaceAll("[^a-zA-Z]", " ").toLowerCase();

        String[] words = paragraph.split("\\s+");

        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));

        Map<String, Integer> count = new HashMap<>();
        String result = "";
        int max = 0;

        for (String w : words) {
            if (!bannedSet.contains(w) && !w.isEmpty()) {
                count.put(w, count.getOrDefault(w, 0) + 1);
                if (count.get(w) > max) {
                    max = count.get(w);
                    result = w;
                }
            }
        }

        return result;
    }
}
