class Solution {
    public int maxDistance(int[] colors) {
        int a=0;int j=colors.length-1; int max=0;
        while(a<=j){
            if(colors[a]!=colors[j]){
                max=j-a;
                break;
            }
            j--;

        }
        j=colors.length-1;
        while(a<=j){
            if(colors[a]!=colors[j]){
                max=Math.max(max,j-a);
                break;
            }
            a++;

        }
        return max;

        
    }
}