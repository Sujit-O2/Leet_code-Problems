class Solution {
    public String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                char prev = sb.charAt(sb.length() - 1);
                int shift = c - '0';
                sb.append((char)(prev + shift));
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
