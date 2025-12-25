class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        int currentSum=nums[0];
        for(int i=1;i<nums.length;i++){
            //nums[i]=start the new subarray
            // currentSum+nums[i]=continue the existing subarray
            currentSum=Math.max(nums[i],currentSum+nums[i]);
            max=Math.max(currentSum,max);
        }
        return max;
    }
}