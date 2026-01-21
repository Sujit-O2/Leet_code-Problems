class Solution {
    public boolean equalFrequency(String word) {
        int[] freq = new int[26];

        // count frequency
        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }

        // try removing one occurrence of each character
        for (int i = 0; i < 26; i++) {
            if (freq[i] == 0) continue;

            freq[i]--; // remove one character

            int same = -1;
            boolean ok = true;

            for (int f : freq) {
                if (f == 0) continue;
                if (same == -1) same = f;
                else if (f != same) {
                    ok = false;
                    break;
                }
            }

            freq[i]++;

            if (ok) return true;
        }

        return false;
    }
}
