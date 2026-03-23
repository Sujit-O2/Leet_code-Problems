class Solution {
    public int generateKey(int num1, int num2, int num3) {
        String a = String.format("%04d", num1);
        String b = String.format("%04d", num2);
        String c = String.format("%04d", num3);

        StringBuilder res = new StringBuilder();

        for (int i = 0; i < 4; i++) {
            int d1 = a.charAt(i) - '0';
            int d2 = b.charAt(i) - '0';
            int d3 = c.charAt(i) - '0';

            int min = Math.min(d1, Math.min(d2, d3));
            res.append(min);
        }

        return Integer.parseInt(res.toString());
    }
}