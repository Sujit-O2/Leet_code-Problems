class Solution {
    public int sumBase(int n, int k) {
int n1=0;
while(n!=0){
    n1+=n%k;
    n/=k;
}  
return n1;      
    }
}