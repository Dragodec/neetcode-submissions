class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray())
        {
            if(Character.isLetterOrDigit(ch))
            {
                sb.append(Character.toLowerCase(ch));
            }
        }
        String mod = sb.toString();
        int left = 0;
        int right = mod.length() - 1;
        while(left <= right)
        {
            if(mod.charAt(left)!=mod.charAt(right))
            return false;

            left++;
            right--;
        }
        return true;
    }
}
