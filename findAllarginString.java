import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        if(s.length()<p.length()){
            return new ArrayList();
        }
        StringBuilder bb=new StringBuilder();
       char c[]=p.toCharArray();
       Arrays.sort(c);

        for(int i=0;i<p.length();i++){
            bb.append(s.charAt(i));
        }
        char[] c1=bb.toString().toCharArray();
        Arrays.sort(c1);
        List<Integer> li=new ArrayList<>();
        if(Arrays.equals(c, c1)){
            li.addLast(0);

        }
        for(int i=p.length();i<s.length();i++){
            bb.deleteCharAt(0);
            bb.append(s.charAt(i));
            char[] c2=bb.toString().toCharArray();
        Arrays.sort(c2);
        if (Arrays.equals(c, c2)){
            li.addLast(i-p.length()+1);
        } 
    }
    return li;
}
}
 class FindAllAnagramString {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length()) return result;

        int[] freqP = new int[26];  // frequency for p
        int[] freqS = new int[26];  // frequency for current window in s
        int k = p.length();

        // count frequency in p
        for (char c : p.toCharArray()) {
            freqP[c - 'a']++;
        }

        // sliding window
        for (int i = 0; i < s.length(); i++) {
            // add new char to window
            freqS[s.charAt(i) - 'a']++;

            // remove old char when window > k
            if (i >= k) {
                freqS[s.charAt(i - k) - 'a']--;
            }

            // compare freq arrays
            if (Arrays.equals(freqP, freqS)) {
                result.add(i - k + 1);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        FindAllAnagramString obj = new FindAllAnagramString();
        System.out.println(obj.findAnagrams("cbaebabacd", "abc")); // Output: [0, 6]
    }
}
