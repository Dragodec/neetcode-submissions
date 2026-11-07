class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // List<List<String>> result = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for(String s : strs)
        {
            String original = s;
            char ca[] = s.toCharArray();
            Arrays.sort(ca);
            String key = new String(ca);
            if(map.containsKey(key))
            {
                List<String> list = map.get(key);
                list.add(original);
            }
            else
            {
                List<String> list = new ArrayList<>();
                list.add(original);
                map.put(key, list);
            }
        }
        return new ArrayList<>(map.values());
    }
}
