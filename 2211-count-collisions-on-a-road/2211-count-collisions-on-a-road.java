class Solution {
    public int countCollisions(String directions) {
        int a=0;
       int left=0;
       while(left<directions.length()&&directions.charAt(left)=='L')left++;
       int right=directions.length()-1;
       while(right>=0&&directions.charAt(right)=='R')right--;

       int col=0;
       for(int i=left;i<=right;i++){
        if(directions.charAt(i)=='S')continue;
        col++;
       }
       return col;
    }
}