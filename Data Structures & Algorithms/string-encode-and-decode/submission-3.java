class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();
        for(int i = 0; i < strs.size(); i++)
        {
            String word = strs.get(i);
            int len = word.length();
            encoded.append(len).append("#").append(word);
        }
        System.out.println(encoded.toString());
        return encoded.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while(i < str.length())
        {
            int start = i;
            while(str.charAt(i)!='#')
            {
                i++;
            }
            int len = Integer.parseInt(str.substring(start, i));
            int wordStart = i+1;
            int wordEnd = wordStart + len;
            String word = str.substring(wordStart, wordEnd);
            result.add(word);   
            i = wordEnd;     
            }
        return result;
    }
}
