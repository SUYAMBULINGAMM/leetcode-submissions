class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int l=0;
        int r=nums.length-1;
        int res=-1;
        while(l<r)
        {
            res=Math.max(res,nums[l]+nums[r]);
            l++;
            r--;
        }
        return res;

    }
}