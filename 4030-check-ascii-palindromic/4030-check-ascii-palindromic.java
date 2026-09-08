class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder bb = new StringBuilder();

        for (char c : s.toCharArray()) {
            String binary = Integer.toBinaryString(c);
            binary = String.format("%8s", binary).replace(' ', '0');
            bb.append(binary);
        }

        return bb.toString().equals(bb.reverse().toString());
    }
}