class Solution {
    public int maxNumberOfBalloons(String text) {
        String s="balloon";
        int a[]=new int [26];


        for(char i:text.toCharArray()){
            a[i-'a']++;
        }
        int min=Math.min(a['b'-'a'],
        Math.min(a['a'-'a'],
        Math.min(a[('l'-'a')]/2
        ,Math.min(a[('o'-'a')]/2
        ,a['n'-'a']))));
        
return min;
    }
}