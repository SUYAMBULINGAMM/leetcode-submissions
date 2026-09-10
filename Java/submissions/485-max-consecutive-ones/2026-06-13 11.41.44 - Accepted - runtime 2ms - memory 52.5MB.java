class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int o=0;
        int max=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==1)
            {
                o++;
            }
            else
            {
                max=Math.max(o,max);
                o=0;
            }
        }
        max=Math.max(o,max);
        return max;
    }
}