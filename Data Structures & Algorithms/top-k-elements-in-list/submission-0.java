class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> minPQ = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));

        for (int num : map.keySet()) {
            minPQ.add(num);
            if (minPQ.size() > k) {
                minPQ.poll();
            }
        }

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = minPQ.poll();
        }

        return res;
    }
}
