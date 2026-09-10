class Solution {
    public int numSubseq(int[] nums, int target) {
        int mod=1000000007;
        int l=nums.length;
        Arrays.sort(nums);
        int[] p=new int[l];
        p[0]=1;
        for(int i=1;i<l;i++)
        {
            p[i]=(p[i-1]*2)%mod;
        }
        int left=0,r=l-1,result=0;
        while(left<=r)
        {
            if(nums[left]+nums[r]<=target)
            {
                result=(result+p[r-left])%mod;
                left++;
            }
            else
            {
                r--;
            }
        }
        return result;
        
        
    }
}