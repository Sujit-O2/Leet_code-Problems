class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        Set<Integer> ass=new TreeSet(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++){
            ass.add(nums[i]);

        }
        k=Math.min(k,ass.size());
        int a[]=new int[k];
        int j=0;
        for(int n:ass){
            if(j>=k) break;
            a[j]=n;j++;

        }
        return a;
        
    }
}