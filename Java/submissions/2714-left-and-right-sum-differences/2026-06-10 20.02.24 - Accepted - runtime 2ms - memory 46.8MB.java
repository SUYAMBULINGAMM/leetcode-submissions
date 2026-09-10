class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int left[]=new int[n];
        int right[]=new int[n];
        left[0]=0;
        right[n-1]=0;
        int lsum=0;
        //left array
        for(int i=0;i<n-1;i++)
        {
            lsum+=nums[i];
            left[i+1]=lsum;
        }
        //right array
        int rsum=0;
        for(int i=n-1;i>0;i--)
        {
            rsum+=nums[i];
            right[i-1]=rsum;
        }
        int res[]=new int[n];
        for(int i=0;i<n;i++)
        {
            res[i]=Math.abs(left[i]-right[i]);
        }
        return res;
    }
}