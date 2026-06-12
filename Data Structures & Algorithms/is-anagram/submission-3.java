class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        if(s.length()!=t.length())
        {
            return false;
        }
        for(char c : s.toCharArray())
        {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for(char c : t.toCharArray())
        {
            if(map.containsKey(c))
            {
                map.put(c, map.get(c)-1);
            }
        }
        for(int i : map.values())
        {
            if(i!=0)
            return false;
        }
        return true;
    }
}
