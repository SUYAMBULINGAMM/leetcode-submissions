class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int j=nums.length-1;
        int i=j-1;
        int p=(nums[i]-1)*(nums[j]-1);
        return p;
        // while(i<j)
        // {
        //     int p=(nums[i]-1)*(nums[j]-1);
        //     if(max<p)
        //     {
        //         max=p;
        //     }
        //     i++;
        //     j++;
        // }
        // return max;
    }
}