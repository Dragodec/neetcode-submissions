class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums)
        {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int highest = 0;
        for(int i : map.values())
        {
            if(i>highest)
            {
                highest=i;
            }
        }
        int majority = 0;
        for(Map.Entry<Integer, Integer> e : map.entrySet())
        {
           if(highest==e.getValue())
           {
            majority = e.getKey();
           }
        }
        return majority;
    }
}