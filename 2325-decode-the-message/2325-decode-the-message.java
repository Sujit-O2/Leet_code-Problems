class Solution {
    public String decodeMessage(String key, String message) {
        char[] map = new char[26];
        boolean[] seen = new boolean[26];
        
        int idx = 0;
        for (char c : key.toCharArray()) {
            if (c != ' ' && !seen[c - 'a']) {
                map[c - 'a'] = (char) ('a' + idx);
                seen[c - 'a'] = true;
                idx++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : message.toCharArray()) {
            if (c == ' ') sb.append(' ');
            else sb.append(map[c - 'a']);
        }

        return sb.toString();
    }
}
