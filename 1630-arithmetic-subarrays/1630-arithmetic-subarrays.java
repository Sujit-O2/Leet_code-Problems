class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        int i=0;
        List<Boolean> bb=new ArrayList();

        while(i<l.length){
        int a[]=new int[r[i]-l[i]+1];
        int k=0;
        for(int j=l[i];j<=r[i];j++){
            a[k++]=nums[j];
        }
        Arrays.sort(a);
        int aa=a[0]-a[1];
        boolean a1=true;
        for( k=1;k<a.length-1;k++){
            if(a[k]-a[k+1]!=aa){
                a1=false;
                
                break;
            }
        }
        bb.add(a1);
        i++;

        }
        return bb;
    }
}