class Solution {
    public static int maximum(int x,int y)
    {
        if(y<x)
        {
            return x;
        }
        return y;
    }
    public int maxSubArray(int[] nums) {
        int sum=0;
        int max=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(sum<0)
            {
                sum=0;
            }
            sum+=nums[i];
            max=maximum(sum,max);
        }
        return max;
    }
}