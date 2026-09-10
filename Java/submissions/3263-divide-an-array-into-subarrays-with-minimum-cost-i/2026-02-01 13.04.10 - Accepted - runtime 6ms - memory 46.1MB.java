class Solution {
    public int minimumCost(int[] nums) {
        int n=nums.length;
        int []r=new int[n-1];
        for(int i=1;i<n;i++)
        {
            r[i-1]=nums[i];
        }
        Arrays.sort(r);
        int sum=nums[0]+r[0]+r[1];
        return sum;
    }
}