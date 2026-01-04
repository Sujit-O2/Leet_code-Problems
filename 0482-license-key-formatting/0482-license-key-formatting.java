class Solution {
    public String licenseKeyFormatting(String s, int k) {

        StringBuffer bb = new StringBuffer();
        s = s.replace("-", "").toUpperCase();

        int firstGroup = s.length() % k;
        int i = 0;

        if (firstGroup > 0) {
            bb.append(s.substring(0, firstGroup));
            i = firstGroup;
        }

        while (i < s.length()) {
            if (bb.length() > 0) {
                bb.append("-");
            }
            bb.append(s.substring(i, i + k));
            i += k;
        }

        return bb.toString();
    }
}
