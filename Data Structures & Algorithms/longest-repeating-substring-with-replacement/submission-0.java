class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int maxLength = 0;
        int highFreq = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(int right = 0; right < s.length(); right++)
        {
           char current = s.charAt(right);
           map.put(current, map.getOrDefault(current,0)+1);
           highFreq = Math.max(highFreq, map.get(current));
           while(((right-left+1) - highFreq) > k)
            {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                left++;
            }
            maxLength = Math.max(maxLength, (right-left+1));
        }
        return maxLength;
    }
}
