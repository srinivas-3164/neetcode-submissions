class Solution {
    public int rob(int[] nums) {
        int n = nums.length;

        if (n == 0)
            return 0;
        if (n == 1)
            return nums[0];
        if (n == 2)
            return Math.max(nums[0], nums[1]);
        // max a theif can earn until ith house.
        int[] dp = new int[n];
        int max = nums[0];
        dp[0] = nums[0];
        dp[1] = nums[1];

        for (int i = 2; i < n; i++) {
            dp[i] = max + nums[i];
            max = Math.max(max, dp[i - 1]);
        }

        return Math.max(max, dp[n - 1]);


    }
}
