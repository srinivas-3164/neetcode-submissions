class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str: strs) {
            char[] charArr = str.toCharArray();

            Arrays.sort(charArr);

            String sorted = new String(charArr);

            if (map.containsKey(sorted)) {
                map.get(sorted).add(str);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(sorted, list);
            }
        }
        
        List<List<String>> ans = new ArrayList<>();
        for (List<String> iter : map.values()) {
            ans.add(iter);
        }

        return ans;

        
    }
}
