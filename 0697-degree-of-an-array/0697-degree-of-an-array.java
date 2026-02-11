class Solution {
    public int findShortestSubArray(int[] nums) {

        HashMap<Integer,Integer> ii = new HashMap<>();

        for(int i : nums){
            ii.put(i, ii.getOrDefault(i,0)+1);
        }

        int val = 0;
        for(int i : ii.keySet()){
            val = Math.max(val, ii.get(i));
        }

        int min = nums.length;
        for(int key : ii.keySet()){
            if(ii.get(key) == val){

                int first = -1;
                int last = -1;
                for(int i = 0; i < nums.length; i++){
                    if(nums[i] == key){
                        if(first == -1) first = i;
                        last = i;
                    }
                }

                int length = last - first + 1;
                min = Math.min(min, length);
            }
        }

        return min;
    }
}
