class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int majEle = nums[0];
        int count = 0;

        for(int i=0; i<n; i++){
            if(nums[i] == majEle){
                count++;

            }else{
                count--;
                if(count == 0){
                    majEle = nums[i];
                    count++;
                }
            }
        }

        return majEle;
    }
}