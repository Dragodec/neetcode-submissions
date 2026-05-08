class Solution {
    public boolean isPalindrome(String s) {
        int len = s.length();
        StringBuilder modified = new StringBuilder();
        for(int i = 0;i<len;i++)
        {
            if(Character.isLetterOrDigit(s.charAt(i)))
            modified.append(Character.toLowerCase(s.charAt(i)));
        }
        String copy = modified.toString();
        String reversed = new StringBuilder(modified).reverse().toString();
        return copy.equals(reversed);
    }
}
