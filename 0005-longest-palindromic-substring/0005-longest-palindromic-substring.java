class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }

        String pali = "";
        int maxLen = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {

                String sub = s.substring(i, j);

                if (isPalindrome(sub) && sub.length() > maxLen) {
                    pali = sub;
                    maxLen = sub.length();
                }
            }
        }

        return pali;
    }

    private boolean isPalindrome(String str) {
        int l = 0, r = str.length() - 1;

        while (l < r) {
            if (str.charAt(l) != str.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}
