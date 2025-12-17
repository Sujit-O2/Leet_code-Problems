class Solution {
    public String clearDigits(String s) {
        Stack<Character> ss = new Stack<>();

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                if (!ss.isEmpty()) {
                    ss.pop();
                }
            } else {
                ss.push(c);
            }
        }

        StringBuilder result = new StringBuilder();
        for (char c : ss) {
            result.append(c);
        }

        return result.toString();
    }
}
