class Solution {

    public String encode(List<String> strs) {
        StringBuilder builder = new StringBuilder();
        for (String str : strs) {
            builder.append(str.length()).append('#').append(str);
        }

        return builder.toString();
    }

    public List<String> decode(String str) {
        int i = 0;
        List<String> ans = new ArrayList<>();
        while (i < str.length()) {
            int breaker = str.indexOf('#', i);
            int len = Integer.parseInt(str.substring(i, breaker));

            ans.add(str.substring(breaker + 1, breaker + 1 + len));

            i = breaker + 1 + len;
        }

        return ans;


    }
}
