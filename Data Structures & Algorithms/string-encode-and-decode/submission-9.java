class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str : strs)
        sb.append(str.length()).append("#").append(str);
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int i = 0;
        while(i < str.length())
        {
            int hash = str.indexOf('#', i);
            int length = Integer.parseInt(str.substring(i, hash));
            String word = str.substring(hash + 1, hash + 1 + length);
            list.add(word);
            i = hash + 1 + length;
        }
        return list;
    }
}
