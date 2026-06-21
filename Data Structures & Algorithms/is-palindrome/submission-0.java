class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int length = s.length();
        int j = length - 1;
        s = s.toLowerCase();
        while (i < j) {
            if (!Character.isLetterOrDigit(s.charAt(i)) || !Character.isLetterOrDigit(s.charAt(j))) {
                if (!Character.isLetterOrDigit(s.charAt(i))) 
                    i++;
                if (!Character.isLetterOrDigit(s.charAt(j))) 
                    j--;
                continue;
            } else if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
                continue;
            } else {
                return false;
            }
           
        }

        return true;


    }
}
