class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String string : strs)
        {
            sb.append(string.length()).append("#").append(string);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded = new ArrayList<>();
        int i = 0;
        while(i < str.length())
        {
           int j = str.indexOf('#', i);
           int length = Integer.parseInt(str.substring(i, j));
           String word = str.substring(j+1, j+1+length);
           decoded.add(word);
           i=j+1+length;
        }
        return decoded;
    }
}
