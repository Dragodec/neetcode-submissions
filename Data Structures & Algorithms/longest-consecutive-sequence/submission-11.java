class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
        return 0;
        int count = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums)
        set.add(num);
        ArrayList<Integer> list = new ArrayList<>(set);
        int[] modified = new int[set.size()];
        for(int i = 0; i < modified.length; i++)
        modified[i] = list.get(i);
        Arrays.sort(modified);
        int current = 1;
        int longest = 1;
        for(int i = 1; i < modified.length; i++)
        {
            if(modified[i] == modified[i-1] + 1)
            current++;
            else
            current = 1;
            longest = Math.max(current, longest);
        }
        return longest;
    }
}
