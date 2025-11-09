class Solution {
    public int[] shuffle(int[] nums, int n) {
        int a[]=new int [nums.length];
        int i=0;
        int j=0;
        while(i<nums.length-1)
        {
            a[i]=nums[j];
            a[i+1]=nums[n+j];
            i+=2;
            j++;
        }
    return a;
        
    }
}