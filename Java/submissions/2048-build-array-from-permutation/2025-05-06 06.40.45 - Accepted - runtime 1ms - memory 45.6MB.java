class Solution {
    public int[] buildArray(int[] nums) {
        int n=nums.length;
        int []r=new int[n];
        for(int i=0;i<n;i++)
        {
            r[i]=nums[nums[i]];
        }
        return r;
        
    }
}