class Solution {
    public int gcdOfOddEvenSums(int n) {
        int odd=0;
        int even=0;
        int a=1;
        for(int i=0;i<n;i++){
            odd+=a;
            a+=2;
        }
        a=0;
        for(int i=0;i<n;i++){
            even+=a;
            a+=2;
        }
    while(even!=0){
        int temp=even;
        even=odd%even;
        odd=temp;
    }  
return odd;
        
    }
}