class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String curr: strs) {
            char[] charArr = curr.toCharArray();
            Arrays.sort(charArr);

            String sortedStr = new String(charArr); 

            if (map.containsKey(sortedStr)) {
                map.get(sortedStr).add(curr);
            } else {
                List<String> arrList = new ArrayList<>();
                arrList.add(curr);
                map.put(sortedStr, arrList);
            }
        }

        List<List<String>> ans = new ArrayList<>();

        for (List<String> eachIter: map.values()) {
            ans.add(eachIter);
        }

        return ans;
    }
}
