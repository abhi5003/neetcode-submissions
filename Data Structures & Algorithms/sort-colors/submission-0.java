class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int zeroCtn = 0;
        int oneCtn = 0;
        int twoCtn = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                zeroCtn++;
            } else if (nums[i] == 1) {
                oneCtn++;
            } else {
                twoCtn++;
            }
        }

        int i = 0;
        while (zeroCtn > 0) {
            nums[i++] = 0;
            zeroCtn--;
        }

        while (oneCtn > 0) {
            nums[i++] = 1;
            oneCtn--;
        }

        while (twoCtn > 0) {
            nums[i++] = 2;
            twoCtn--;
        }
    }
}