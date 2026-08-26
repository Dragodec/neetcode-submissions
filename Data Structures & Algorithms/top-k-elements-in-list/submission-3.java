class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int result[] = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>   ((a,b) -> b.getValue()- a.getValue());
        for(int i : nums)
        map.put(i, map.getOrDefault(i, 0) + 1);
        for(Map.Entry<Integer, Integer> pair : map.entrySet())
        {
            maxHeap.add(pair);
        }
        for(int i = 0; i < k; i++)
        {
            result[i]=maxHeap.poll().getKey();
        }
        return result;
    }
}
