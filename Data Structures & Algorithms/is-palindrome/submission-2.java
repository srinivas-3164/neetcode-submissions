class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int length = s.length();
        int j = length - 1;
        s = s.toLowerCase();
        while (i < j) {
            // Ignore non alphanumeric character.
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) i++;
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) j--;

            if (s.charAt(i) != s.charAt(j)) 
                return false;

            i++;
            j--;
           
        }

        return true;


    }
}
