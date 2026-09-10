class Solution {
    public int maximumLength(int[] nums, int k) {
        int max=0;
        for(int i=0;i<k;i++)
        {
            int dp[]=new int[k];
            for(int num:nums)
            {
                int cm=num%k;
                int pm=(k+i-cm)%k;
                dp[cm]=Math.max(dp[cm],dp[pm]+1);
                max=Math.max(max,dp[cm]);
            }
        }
        return max;
        
    }
}