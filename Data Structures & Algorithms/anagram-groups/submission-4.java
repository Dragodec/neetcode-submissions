class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String string : strs)
        {
            char[] chars = string.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            map.computeIfAbsent(sorted, s -> new ArrayList<>()).add(string);
        }
        List<List<String>> result = new ArrayList<>(map.values());
        return result;
    }
}
