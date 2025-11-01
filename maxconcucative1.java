import java.util.HashMap;
import java.util.Map;

public class maxconcucative1 {
    
}
class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0;
        int maxlen=0;
        Map<Integer,Integer> aa=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            aa.put(nums[i],aa.getOrDefault(nums[i],0)+1);
            while(aa.getOrDefault(0,0)>k){
                if(nums[l]==0){
                    aa.put(0,aa.getOrDefault(0,0)-1);
                }
                l++;

            }
            maxlen=Math.max(maxlen,i-l+1);

        }
        return maxlen;
    }
}


class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0, zeroCount = 0, maxLen = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) zeroCount++;

            while (zeroCount > k) {
                if (nums[left] == 0) zeroCount--;
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
