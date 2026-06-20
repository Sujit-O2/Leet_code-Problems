class Solution {
    public int minMaxDifference(int num) {
        String s = String.valueOf(num);

        char ch = ' ';
        for (char c : s.toCharArray()) {
            if (c != '9') {
                ch = c;
                break;
            }
        }

        String max = s;
        if (ch != ' ') {
            max = s.replace(ch, '9');
        }

        // Minimum
        char first = s.charAt(0);
        String min = s.replace(first, '0');

        return Integer.parseInt(max) - Integer.parseInt(min);
    }
}