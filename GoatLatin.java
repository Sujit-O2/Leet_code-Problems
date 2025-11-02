public class GoatLatin {
    public static void main(String[] args) {
        Solution s = new Solution();
        String sentence = "I speak Goat Latin";
        System.out.println(s.toGoatLatin(sentence));
    }
}

class Solution {
    public String toGoatLatin(String sentence) {
        String[] parts = sentence.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < parts.length; i++) {
            StringBuilder word = new StringBuilder(parts[i]);
            char c = Character.toLowerCase(word.charAt(0));

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                word.append("ma");
            } else {
                char first = word.charAt(0);
                word.deleteCharAt(0);
                word.append(first).append("ma");
            }

            for (int j = 0; j <= i; j++) {
                word.append('a');
            }

            result.append(word);
            if (i != parts.length - 1) result.append(" ");
        }

        return result.toString();
    }
}
