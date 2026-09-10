class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int j=0;
        int m=0;
        for(int i=0;i<n;i++)
        {
            while(nums[i]-nums[j]>1)
            {
                j++;
            }
            if(nums[i]-nums[j]==1)
            {
                m=Math.max(m,i-j+1);
            }
        }
        return m;
        
    }
}