class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str : strs)
        {
            sb.append(str.length()).append("#").append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded = new ArrayList<>();
        int i = 0;
        while(i < str.length())
        {
            int hashIndex = str.indexOf('#', i);
            int length = Integer.parseInt(str.substring(i, hashIndex));
            String word = str.substring(hashIndex+1, hashIndex+length+1);
            decoded.add(word);
            i=hashIndex+length+1;
        }
        return decoded;
    }
}
