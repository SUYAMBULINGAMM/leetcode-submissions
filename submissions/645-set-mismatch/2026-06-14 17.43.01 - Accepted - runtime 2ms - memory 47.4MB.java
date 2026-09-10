class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        boolean s[]=new boolean[n+1];
        int ans[]=new int[2];
        int k=0;
        for(int x:nums)
        {
            if(s[x])
            {
                ans[k++]=x;
            }
            s[x]=true;
        }
        for(int i=1;i<=n;i++)
        {
            if(!s[i])
            {
                ans[k++]=i;
                break;
            }
        }
        return ans;
    }
}