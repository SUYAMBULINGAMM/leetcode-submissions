class Solution {
    public int waysToSplitArray(int[] nums) {
        long left=0;
        long right=0;
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            right+=nums[i];
        }
        for(int i=0;i<nums.length-1;i++)
        {
            left+=nums[i];
            if(left>=right-left)
            {
                c++;
            }
        }
        return c;
        

    }
}