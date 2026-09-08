class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int sec=0;
        int last =0;
        for(int i: requests){
            while(last!=i){
                            if(last>i){
                                last --;
                                sec++;
                            }
                            else {
                                last++;
                                sec++;
                            }

            }
    }   
    return sec;
    }
}