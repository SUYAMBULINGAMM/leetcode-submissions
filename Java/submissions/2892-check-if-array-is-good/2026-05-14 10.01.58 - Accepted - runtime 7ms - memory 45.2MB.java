class Solution {
    public boolean isGood(int[] nums) {
        int n=nums.length;
        int max=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]>max)
            {
                max=nums[i];
            }
        }
        int base[]=new int[max+1];
        for(int i=0;i<max+1;i++)
        {
            if(i<max)
            {
                base[i]=i+1;
            }
            else
            {
                base[i]=max;
            }
        }
        Arrays.sort(base);
        Arrays.sort(nums);
        if(nums.length != base.length)
        {
            return false;
        }
        else
        {
            for(int i=0;i<n;i++)
            {
                if(nums[i] == base[i])
                {
                    continue;
                }
                return false;
            }
        }
        return true;
    }
}