class Solution {
    public int maxSubArray(int[] nums) {
        int largest=nums[0];
        int csum=nums[0];
        int n=nums.length;
            for(int i=1;i<n;i++)
            {
                csum=Math.max(nums[i], csum+nums[i]);
                largest= Math.max(largest,csum);
            }
        return largest;
    }
}