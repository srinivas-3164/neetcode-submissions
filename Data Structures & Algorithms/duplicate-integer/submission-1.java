class Solution {
    public boolean hasDuplicate(int[] nums) {
        if (nums.length == 0) {
            return false;
        }
        Arrays.sort(nums);
        int lastFound = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (lastFound == nums[i]) {
                return true;
            } 
            lastFound = nums[i];
        }

        return false;
    }
}