class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        
        int prev1 = 0;
        int prev2 = 0;


        for (int i = 2; i < n; i++ ) {
            int temp = prev2;
            prev2 = Math.min(prev2 + cost[i - 1],prev1 + cost[i - 2]);
            prev1 = temp;
        }

        return Math.min(prev2 + cost[n - 1], prev1 + cost[n - 2]);
    }
}
