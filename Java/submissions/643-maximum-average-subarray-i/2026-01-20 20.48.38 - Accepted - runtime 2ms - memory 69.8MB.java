class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int s=0;
        for(int i=0;i<k;i++)
        {
            s+=nums[i];
        }
        int ms=s;
        for(int i=k;i<nums.length;i++)
        {
            s-=nums[i-k];
            s+=nums[i];
            if(s>ms)
            {
                ms=s;
            }
        }
        double result=ms/(double)k;
        return result;
    }
}