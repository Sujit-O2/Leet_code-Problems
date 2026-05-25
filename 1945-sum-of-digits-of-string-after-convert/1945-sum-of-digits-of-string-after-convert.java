class Solution {
    public int getLucky(String s, int k) {

        StringBuilder bb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            bb.append(ch - 'a' + 1);
        }

        String num = bb.toString();
        for (int i = 0; i < k; i++) {

            int sum = 0;

            for (char ch : num.toCharArray()) {
                sum += ch - '0';
            }

            num = String.valueOf(sum);
        }

        return Integer.parseInt(num);
    }
}