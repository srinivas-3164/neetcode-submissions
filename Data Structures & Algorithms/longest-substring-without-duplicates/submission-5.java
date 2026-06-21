class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> lastFound = new HashMap<>();

        int ans = 0;
    
        for (int i = 0, j = 0; j < s.length(); j++) {
            char currentChar = s.charAt(j);

            if (lastFound.containsKey(currentChar)) {
                i = Math.max(i, lastFound.get(currentChar) + 1);
            }

            lastFound.put(currentChar, j);

            ans = Math.max(ans , j - i + 1);
        }

        return ans;
    }
}
