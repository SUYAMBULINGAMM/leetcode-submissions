class Solution {
    public static int maximum(int x,int y)
    {
        if(y<x)
        {
            return x;
        }
        return y;
    }
    public static int minimum(int x,int y)
    {
        if(y<x)
        {
            return y; 
        }
        return x;
    }
    public int maxSubarraySumCircular(int[] nums) {
        int totalsum=0;
        for(int i=0;i<nums.length;i++)
        {
            totalsum+=nums[i];
        }
        int max=Integer.MIN_VALUE;
        int maxsum=0;
        for(int i=0;i<nums.length;i++)
        {
            if(maxsum<0)
            {
                maxsum=0;
            }
            maxsum+=nums[i];
            max=maximum(maxsum,max);
        }
        int min=Integer.MAX_VALUE;
        int minsum=0;
        for(int i=0;i<nums.length;i++)
        {
            if(minsum>0)
            {
                minsum=0;
            }
            minsum+=nums[i];
            min=minimum(minsum,min);
        }
        int cirtotal=totalsum-min;
        if(max<0)
        {
            return max;

        }
        else
        {
            return maximum(cirtotal,max);

        }
    }
}