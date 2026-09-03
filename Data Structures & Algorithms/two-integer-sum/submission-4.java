class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<Pair> a = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            a.add(new Pair(nums[i], i));
        }

        Collections.sort(a, (p1, p2) -> Integer.compare(p1.getValue(), p2.getValue()));

        int i = 0, j = nums.length - 1;
        while (i < j) {
            int sum = a.get(i).getValue() + a.get(j).getValue();
            if (sum == target) {
                int idx1 = a.get(i).getIndex();
                int idx2 = a.get(j).getIndex();
                return new int[] {Math.min(idx1, idx2), Math.max(idx1, idx2)};
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }
        return new int[] {};
    }

    class Pair {
        private int value;
        private int index;

        public Pair(int value, int index) {
            this.value = value;
            this.index = index;
        }

        public int getValue() {
            return value;
        }

        public int getIndex() {
            return index;
        }
    }
}
