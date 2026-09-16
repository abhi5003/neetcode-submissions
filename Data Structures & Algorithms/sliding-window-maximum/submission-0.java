class Solution {

    public int[] maxSlidingWindow(int[] nums, int k) {

        int n = nums.length;

        // Result array size:
        // If window size is k,
        // number of windows = n - k + 1
        int[] result = new int[n - k + 1];

        // Max Heap (PriorityQueue)
        // Each element stores: {value, index}
        // We sort by value in descending order (max heap behavior)
        PriorityQueue<int[]> maxHeap =
                new PriorityQueue<>((a, b) -> b[0] - a[0]);

        int resultIndex = 0;

        // Traverse entire array
        for (int i = 0; i < n; i++) {

            // 1️⃣ Add current element into heap
            // Store both value and index
            maxHeap.offer(new int[]{nums[i], i});

            // 2️⃣ Start producing results only when first window completes
            // First full window appears when i >= k - 1
            if (i >= k - 1) {

                // 3️⃣ Remove elements that are outside the current window
                // Current window range:
                // [i - k + 1 ... i]
                //
                // So any element with index <= i - k is outdated
                while (maxHeap.peek()[1] <= i - k) {
                    maxHeap.poll();
                }

                // 4️⃣ The top of heap is the maximum of current window
                result[resultIndex] = maxHeap.peek()[0];
                resultIndex++;
            }
        }

        return result;
    }
}