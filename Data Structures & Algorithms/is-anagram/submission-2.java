class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }
        
        int[] chars = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int ascii = (int) s.charAt(i);
            chars[ascii - 97]++;
            int oAscii = (int) t.charAt(i);
            chars[oAscii - 97]--;
        }

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != 0) {
                return false;
            }
        }

        return true;
    }
}
