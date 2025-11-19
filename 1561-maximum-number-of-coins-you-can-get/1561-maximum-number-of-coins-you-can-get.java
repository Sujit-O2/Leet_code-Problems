class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int left=piles.length-2;
        int sum=0;
        int i=0;
        while(piles.length/3>i){
            sum+=piles[left];
            left-=2;
            i++;
        }
        return sum;
        
    }
}