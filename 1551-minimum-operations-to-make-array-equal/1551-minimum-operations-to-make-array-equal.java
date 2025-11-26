class Solution {
    public int minOperations(int n) {
        int a[]=new int [n];
        for(int i=0;i<n;i++){
            a[i]=(2*i)+1;

        }
        int left=0, right=n-1;
        int cnt=0;
        while(left<right){
            if(a[left]!=a[right]){
                cnt+=(a[right]-a[left])/2;
            }
            left++;
            right--;
        }
        return cnt;
        
    }
}