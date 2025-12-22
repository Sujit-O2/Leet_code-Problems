class Solution {
    public int countPoints(String rings) {

        StringBuilder[] rods = new StringBuilder[10];
        for (int i = 0; i < 10; i++) {
            rods[i] = new StringBuilder();
        }

        for (int i = 0; i < rings.length(); i += 2) {
            char color = rings.charAt(i);
            int rod = rings.charAt(i + 1) - '0';
            rods[rod].append(color);
        }

        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (rods[i].indexOf("R") != -1 &&
                rods[i].indexOf("G") != -1 &&
                rods[i].indexOf("B") != -1) {
                count++;
            }
        }

        return count;
    }
}
