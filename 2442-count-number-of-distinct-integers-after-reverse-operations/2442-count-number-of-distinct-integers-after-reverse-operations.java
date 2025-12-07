class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> aa = Arrays.stream(nums)
                                .boxed()
                                .collect(Collectors.toSet());
        for (int x : nums) {
            int rev = 0;
            int a = x;
            while (a != 0) {
                rev = rev * 10 + a % 10;
                a /= 10;
            }
            aa.add(rev);
        }

        return aa.size();
    }
}
