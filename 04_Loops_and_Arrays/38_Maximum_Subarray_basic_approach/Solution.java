class Solution {
    public int maxSubArray(int[] nums) {
        int best=nums[0],current=nums[0];
        for(int i=1; i<nums.length; i++){
            current=Math.max(nums[i],current+nums[i]);
            if(current>best)best=current;
        }
        return best;
    }
}
